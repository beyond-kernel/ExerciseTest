package definition;

import org.jetbrains.annotations.NotNull;

public class Processo {


    private static String lastId;
    private static @NotNull String url = "http://agapito-server.herokuapp.com/processos";

    public static void setLast(String id) {
        lastId = id;
    }
    public static String getLastId(){return lastId;}
    public static @NotNull String getUrl() {
        return url;
    }

}
