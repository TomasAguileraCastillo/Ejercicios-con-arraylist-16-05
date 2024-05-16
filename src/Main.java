import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> nombres = new ArrayList<String>();
        nombres.add("juan");
        nombres.add("daniel");
        nombres.add("roberto");
        nombres.add("cecilio");
        nombres.add("alfreda");

        /* //utilizacion del metodo clear
        System.out.println("valores en el arreglo " + nombres);
        nombres.clear();
        System.out.println("valores en el arreglo " + nombres);*/
        // utilizacion del metodo remove

        System.out.println(nombres);
        nombres.remove(2);
        System.out.println(nombres);
    }
}
