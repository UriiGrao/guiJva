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

/**
 *
 * @author uriigrao
 */
public class App {

    public static Map<String, User> users = new HashMap<>();

    public static void main(String[] args) {
        leerFicheros();

        addUser();

        Login login = new Login(null, true);
        login.setLocationRelativeTo(null);
        login.setVisible(true);
    }

    private static void addUser() {
        users.put("admin", (new User("admin", "admin")));
        users.put("orito", new User("orito", "1234"));
    }

    private static void leerFicheros() {
        File usersF = new File("usuarios.txt");
        File partis = new File("partis.txt");

        FileReader frU = null;
        FileReader frP = null;

        try {
            frU = new FileReader(usersF);
            frP = new FileReader(partis);
            BufferedReader brU = new BufferedReader(frU);
            BufferedReader brP = new BufferedReader(frP);
            String line;

            while ((line = brU.readLine()) != null) {
                String[] breakLine = line.split(" ");
                User user = new User(breakLine[0], breakLine[1]);
                users.put(breakLine[0], user);
            }
            while ((line = brP.readLine()) != null) {
                String[] breakLine = line.split(" ");
                boolean imp = Boolean.parseBoolean(breakLine[7]);
                Partituras partitura = new Partituras(breakLine[1], breakLine[2], breakLine[3],
                        breakLine[4], breakLine[5], breakLine[6], imp);
                try {
                    users.get(breakLine[0]).putPartitura(breakLine[1], partitura);
                } catch (MiExcepcion mx) {
                    
                }
            }

        } catch (IOException ioex) {
            System.out.println("Error Al Leer: " + ioex.getMessage());
        }
    }

}
