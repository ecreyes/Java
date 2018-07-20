package modificadoresacceso;
import paquete1.Clase2;
import paquete2.Clase3;
import paquete2.Clase4;

public class ModificadoresAcceso {

    public static void main(String[] args) {
        //Prueba de acceso a Clase1 desde otras clases
        //Acceso a Clase1 desde Clase2
        System.out.println("Acceso desde Clase2 Mismo paquete");
        new Clase2().pruebaDesdeClase2();
        
        System.out.println("Acceso desde Clase3 Paquete Distinto y Heredada");
        new Clase3().pruebaDesdeClase3();
        
        System.out.println("Acceso desde Clase4 Fuera del paquete NO hereado");
        new Clase4().pruebaDesdeClase4();
    }    
}
