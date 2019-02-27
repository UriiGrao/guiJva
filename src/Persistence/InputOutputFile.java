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

    public static void saveUser(User user) throws MiExcepcion{
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
}
