/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistence;

import static App.App.users;
import static App.App.partituras;
import Models.*;
import Utils.MiExcepcion;
import java.io.*;

/**
 *
 * @author uriigrao
 */
public class InputOutputFile {

    /**
     * funcion para leer los dos fichero el de usuarios y el de partituras,
     * guardamos los usuarios en un HashMap y las partituras en cada usuario mas
     * un arrayList
     */
    public static void leerFicheros() {
        File usersF = new File("usuarios.txt");
        File partis = new File("partis.txt");

        FileReader frU = null;
        FileReader frP = null;

        try {

            if (!usersF.exists()) {
                try {
                    usersF.createNewFile();
                    User user = new User("admin", "admin");
                    App.App.users.put("admin", user);
                    saveUser(user);
                } catch (MiExcepcion ex) {

                }
            }
            if (!partis.exists()) {
                partis.createNewFile();
            }

            frU = new FileReader(usersF);
            frP = new FileReader(partis);
            BufferedReader brU = new BufferedReader(frU);
            BufferedReader brP = new BufferedReader(frP);
            String line;

            while ((line = brU.readLine()) != null) {
                String[] breakLine = line.split(",");
                User user = new User(breakLine[0], breakLine[1]);
                users.put(breakLine[0], user);
            }
            while ((line = brP.readLine()) != null) {
                String[] breakLine = line.split(",");
                boolean imp = Boolean.parseBoolean(breakLine[7]);
                Partituras partitura = new Partituras(breakLine[1], breakLine[2], breakLine[3],
                        breakLine[4], breakLine[5], breakLine[6], imp);
                try {
                    users.get(breakLine[0]).putPartitura(breakLine[1], partitura);
                    partituras.add(partitura);
                } catch (MiExcepcion mx) {
                    System.out.println(mx.getMessage());
                }
            }
        } catch (IOException ioex) {
            System.out.println("Error Al Leer: " + ioex.getMessage());
        }
    }

    public static void saveUser(User user) throws MiExcepcion {
        BufferedWriter bw = null;
        try {
            File userF = new File("usuarios.txt");
            bw = new BufferedWriter(new FileWriter(userF, true));
            bw.write(user.toString());
            bw.newLine();
            bw.close();
        } catch (IOException ex) {

        } finally {
            try {
                if (bw != null) {
                    bw.close();
                }
            } catch (IOException ex) {
                throw new MiExcepcion("Error al Guardar Usuario");
            }
        }
    }

    public static void saveParti(User user, Partituras partitura) throws MiExcepcion {
        BufferedWriter bw = null;
        try {
            File partituraF = new File("partis.txt");
            bw = new BufferedWriter(new FileWriter(partituraF, true));
            bw.write(user.getUserName() + "," + partitura.toString());
            bw.newLine();
            bw.close();
        } catch (IOException ex) {

        } finally {
            try {
                if (bw != null) {
                    bw.close();
                }
            } catch (IOException ex) {
                throw new MiExcepcion("Error al Guardar Usuario");
            }
        }
    }

    public static void deleteUser(User user) throws MiExcepcion {
        BufferedWriter writer = null;
        BufferedReader reader = null;

        String lineToRemove = user.toString();
        String currentLine;

        File userF = new File("usuarios.txt");
        File tempFile = new File("myTempFile.txt");

        try {

            reader = new BufferedReader(new FileReader(userF));
            writer = new BufferedWriter(new FileWriter(tempFile));

            while ((currentLine = reader.readLine()) != null) {
                // trim newline when comparing with lineToRemove
                String trimmedLine = currentLine.trim();
                if (trimmedLine.equals(lineToRemove)) {
                    continue;
                }
                writer.write(currentLine + System.getProperty("line.separator"));
            }
            writer.close();
            reader.close();
            boolean successful = tempFile.renameTo(userF);
            deletePartituraForUser(user);

        } catch (IOException ix) {
            throw new MiExcepcion("Fatal error: " + ix.getMessage());
        } finally {
            try {
                if (writer != null && reader != null) {
                    writer.close();
                    reader.close();
                }
            } catch (IOException ex) {
                throw new MiExcepcion("Fatal error: " + ex.getMessage());
            }
        }
    }

    public static void deletePartituraForUser(User user) throws MiExcepcion {
        BufferedWriter writer = null;
        BufferedReader reader = null;

        String lineToRemove = user.getUserName();
        String currentLine;

        File partituras = new File("partis.txt");
        File tempFile = new File("myTempFile.txt");
        try {

            reader = new BufferedReader(new FileReader(partituras));
            writer = new BufferedWriter(new FileWriter(tempFile));

            while ((currentLine = reader.readLine()) != null) {
                String[] line = currentLine.split(",");

                if (line[0].equals(lineToRemove)) {
                    continue;
                }
                writer.write(currentLine + System.getProperty("line.separator"));
            }
            writer.close();
            reader.close();
            boolean successful = tempFile.renameTo(partituras);

        } catch (IOException ix) {
            throw new MiExcepcion("Fatal error: " + ix.getMessage());
        } finally {
            try {
                if (writer != null && reader != null) {
                    writer.close();
                    reader.close();
                }
            } catch (IOException ex) {
                throw new MiExcepcion("Fatal error: " + ex.getMessage());
            }
        }
    }

    public static void deletePartitura(User user, String codePartitura) throws MiExcepcion {
        BufferedWriter writer = null;
        BufferedReader reader = null;

        String lineToRemove = user.getUserName() + "," + codePartitura;
        String currentLine;

        File fPartis = new File("partis.txt");
        File tempFile = new File("myTempFile.txt");
        try {
            reader = new BufferedReader(new FileReader(fPartis));
            writer = new BufferedWriter(new FileWriter(tempFile));

            while ((currentLine = reader.readLine()) != null) {
                String[] line = currentLine.split(" ");

                if (lineToRemove.equals(line[0] + "," + line[1])) {
                    continue;
                }
                writer.write(currentLine + System.getProperty("line.separator"));
            }
            writer.close();
            reader.close();
            boolean successful = tempFile.renameTo(fPartis);
        } catch (IOException iox) {
            throw new MiExcepcion("Fatal error: " + iox.getMessage());
        } finally {
            try {
                if (writer != null && reader != null) {
                    writer.close();
                    reader.close();
                }
            } catch (IOException ex) {
                throw new MiExcepcion("Fatal error: " + ex.getMessage());
            }
        }

    }
}
