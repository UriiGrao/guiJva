/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package App;

import Guijva.*;
import java.util.*;
import Models.*;

/**
 *
 * @author uriigrao
 */
public class App {

    public static Map<String, User> users = new HashMap<>();

    public static void main(String[] args) {

        addUser();

        Login login = new Login(null, true);
        login.setLocationRelativeTo(null);
        login.setVisible(true);
    }

    private static void addUser() {
        users.put("admin", (new User("admin", "admin")));
        users.put("orito", new User("orito", "1234"));
    }

}
