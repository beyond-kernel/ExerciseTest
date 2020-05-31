package definition;

public class Processo {


    private static String lastId;
    private static String url = "http://agapito-server.herokuapp.com/processos";

    public static void setLast(String id) {
        lastId = id;
    }

    public static String getUrl() {
        return url;
    }

}
