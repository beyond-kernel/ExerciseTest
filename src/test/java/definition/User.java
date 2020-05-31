package definition;
import groovy.json.internal.LazyMap;
import org.jetbrains.annotations.NotNull;

public class User {
    private static final String URL_USER = "http://agapito-server.herokuapp.com/processos";
    private static @NotNull LazyMap fieldsJson = new LazyMap();
    private static String lastUser;

    public static void addFields(String field, String value) {
        fieldsJson.put(field, value);
    }

    public static void clearFields() {
        fieldsJson.clear();
    }

    public static @NotNull LazyMap getFields() {
        return fieldsJson;
    }

    public static @NotNull String getEndPoint() {
        return URL_USER;
    }

    public static String getLastUser() {
        return lastUser;
    }

    public static void setLastUser(String lastUser) {
        User.lastUser = lastUser;
    }

}
