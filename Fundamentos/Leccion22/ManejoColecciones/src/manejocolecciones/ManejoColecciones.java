package manejocolecciones;
import java.util.*;

public class ManejoColecciones {
    public static void main(String[] args) {
        ArrayList<String> lista = new ArrayList<>();
        lista.add("1");
        lista.add("Eduardo");
        lista.add("Reyes");
        for(String elemento:lista){
            System.out.println(elemento);
        }
        lista.add("uno");
        lista.add("dos");
        lista.remove(3);
        System.out.println("");
        for(String elemento:lista){
            System.out.println(elemento);
        }
    }
}
