/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistence;

import Models.*;
import Utils.MiExcepcion;
import java.io.*;

/**
 *
 * @author uriigrao
 */
public class InputOutputFile {

    public static void saveUser(User user) throws MiExcepcion {
        BufferedWriter bw = null;
        try {
            File userF = new File("usuarios.txt");
            bw = new BufferedWriter(new FileWriter(userF, true));
            bw.write(user.getUserName() + " " + user.getPassword());
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

        } catch (IOException ix) {
            throw new MiExcepcion("Fatal error: " + ix.getMessage());
        } finally {
            try {
                if(writer != null && reader != null) {
                    writer.close();
                    reader.close();
                }
            } catch(IOException ex) {
                throw new MiExcepcion("Fatal error: " + ex.getMessage());
            }
        }
    }
}
