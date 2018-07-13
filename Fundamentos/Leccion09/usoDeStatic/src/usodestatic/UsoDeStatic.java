package usodestatic;

public class UsoDeStatic {

    public static void main(String[] args) {
        Persona p1 = new Persona("Eduardo");
        System.out.println("número de personas: "+Persona.getContadorPersona());
        System.out.println("nombre: "+p1.getNombre()+" id: "+p1.getIdPersona());
    }
    
}

class Persona{
    private String nombre;
    private int idPersona;
    private static int contadorPersona=0;
    
    Persona(String nombre){
        contadorPersona++;
        idPersona = contadorPersona;
        this.nombre = nombre;
    }
    
    public static int getContadorPersona(){
        return contadorPersona;
    }
    
    public int getIdPersona(){
        return idPersona;
    }
    
    public String getNombre(){
        return nombre;
    }
}