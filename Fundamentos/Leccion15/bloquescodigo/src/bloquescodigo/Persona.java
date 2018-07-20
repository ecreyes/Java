package bloquescodigo;

public class Persona {
    private final int idPersona;
    private static int contadorPersonas;
    static{
        System.out.println("Se ejecuta bloque static");
        contadorPersonas=10;
    }
    //bloque inicializador
    {
        System.out.println("Ejecuta bloque inicializador");
        idPersona = ++contadorPersonas;
    }
    
    Persona(){
        System.out.println("Ejecuta constructor");
    }
    
    public int getIdPersona(){
        return idPersona;
    }
    
    public static int getContadorPersonas(){
        return contadorPersonas;
    }
}
