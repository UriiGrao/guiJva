/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package App;

import Guijva.*;
import java.util.*;
import Models.*;
import static Persistence.InputOutputFile.leerFicheros;

/**
 *
 * @author uriigrao
 */
public class App {

    public static boolean fichero = false;
    public static Map<String, User> users = new HashMap<>();
    public static ArrayList<Partituras> partituras = new ArrayList<>();

    public static void main(String[] args) {
        leerFicheros();

        Login login = new Login(null, true);
        login.setLocationRelativeTo(null);
        login.setVisible(true);
    }

}
