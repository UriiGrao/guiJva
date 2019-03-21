package App;

import static App.App.*;
import Models.*;
import java.util.*;

/**
 * Aqui tenemos varias funciones utiles en toda la App.
 *
 * @author uriigrao
 */
public class Functions {

    /**
     * Function que devuelve todos los nombres de los usuarios registrados.
     *
     * @return
     */
    public static ArrayList<String> getAllUsersNames() {
        ArrayList<String> usernames = new ArrayList<>(users.keySet());
        usernames.remove("admin");
        return usernames;
    }

    /**
     * function que devuelve arrayList de las partituras
     *
     * @param user
     * @return el codigo y nombre del artista.
     */
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

    /**
     * function que coje al usuario por su userName
     *
     * @param userName
     * @return el objeto usuario.
     */
    public static User getByName(String userName) {
        for (User user : users.values()) {
            if (user.getUserName().equals(userName)) {
                return user;
            }
        }
        return null;
    }

}
