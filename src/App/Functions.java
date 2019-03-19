package App;

import static App.App.*;
import Models.*;
import java.util.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author uriigrao
 */
public class Functions {

    public static ArrayList<String> getAllUsersNames() {
        ArrayList<String> usernames = new ArrayList<>(users.keySet());
        usernames.remove("admin");
        return usernames;
    }

    public static ArrayList<String> getAllpartisName(User user) {
        ArrayList<String> lista = new ArrayList<>();
        ArrayList<Partituras> partis = new ArrayList<>();

        if (user.getPartituras().size() > 0) {
            user.getPartituras().forEach((k, v) -> partis.add(v));
        }
        partis.stream().forEach((part) -> {
            lista.add(part.getCodigo() + " " + part.getArtista());
        });
        return lista;
    }

    public static User getByName(String userName) {
        for (User user : users.values()) {
            if (user.getUserName().equals(userName)) {
                return user;
            }
        }
        return null;
    }

}
