/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package App;

import Guijva.*;
import java.util.*;
import Models.*;
import Utils.MiExcepcion;
import java.io.*;
import javax.swing.JOptionPane;

/**
 *
 * @author uriigrao
 */
public class App {

    public static boolean fichero = false;
    public static Map<String, User> users = new HashMap<>();
    public static ArrayList<Partituras> partiturasUser = new ArrayList<>();

    public static void main(String[] args) {
        leerFicheros();

        Login login = new Login(null, true);
        login.setLocationRelativeTo(null);
        login.setVisible(true);
    }

    private static void leerFicheros() {
        File usersF = new File("usuarios.txt");
        File partis = new File("partis.txt");

        FileReader frU = null;
        FileReader frP = null;
        if (usersF.exists() && partis.exists()) {
            try {
                frU = new FileReader(usersF);
                frP = new FileReader(partis);
                BufferedReader brU = new BufferedReader(frU);
                BufferedReader brP = new BufferedReader(frP);
                String line;

                while ((line = brU.readLine()) != null) {
                    String[] breakLine = line.split(" ");
                    if (breakLine.length == 3) {
                        String[] partituras = breakLine[3].toLowerCase().split(":");
                        for (String partitura : partituras) {
                            boolean impres = false;

                            String[] partPartitura = partitura.toLowerCase().split(",");
                            if ("true".equals(partPartitura[6])) {
                                impres = true;
                            }
                            partiturasUser.add(new Partituras(partPartitura[0], partPartitura[1], partPartitura[2], partPartitura[3],
                                    partPartitura[4], partPartitura[5], impres));
                        }
                    } else if (breakLine.length == 2) {
                        User user = new User(breakLine[0], breakLine[1]);
                        users.put(breakLine[0], user);
                    }
                }
                while ((line = brP.readLine()) != null) {
                    String[] breakLine = line.split(" ");
                    boolean imp = Boolean.parseBoolean(breakLine[7]);
                    Partituras partitura = new Partituras(breakLine[1], breakLine[2], breakLine[3],
                            breakLine[4], breakLine[5], breakLine[6], imp);
                    try {
                        users.get(breakLine[0]).putPartitura(breakLine[1], partitura);
                    } catch (MiExcepcion mx) {
                        System.out.println(mx.getMessage());
                    }
                }

            } catch (IOException ioex) {
                System.out.println("Error Al Leer: " + ioex.getMessage());
            }
        } else {
            try {
                if (!usersF.exists()) {
                    usersF.createNewFile();
                }
                if (!partis.exists()) {
                    partis.createNewFile();
                }
                fichero = true;
            } catch (IOException ex) {
                System.out.println("Error al Crear TXT: " + ex.getMessage());
            }
        }
    }
}
