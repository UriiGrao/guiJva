/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

import Utils.*;
import java.util.*;

/**
 *
 * @author uriigrao
 */
public class User {

    private String userName;
    private String password;
    private HashMap<String, Partituras> partituras;

    public User(String userName, String password) {
        this.userName = userName;
        this.password = password;
        this.partituras = new HashMap<>();
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public HashMap<String, Partituras> getPartituras() {
        return partituras;
    }

    public void setPartituras(HashMap<String, Partituras> partituras) {
        this.partituras = partituras;
    }

    public void putPartitura(String code, Partituras partitura) throws MiExcepcion {
        if (!this.partituras.containsKey(code)) {
            this.partituras.put(code, partitura);
        } else {
            throw new MiExcepcion("El codigo se repite!");
        }
    }

    public void deletePartitura(String codeParti) {
        this.partituras.remove(codeParti);
    }

    @Override
    public String toString() {
        String string = getUserName() + "," + getPassword();
        return string;
    }
}
