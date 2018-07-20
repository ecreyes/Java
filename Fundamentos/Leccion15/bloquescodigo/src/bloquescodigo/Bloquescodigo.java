package bloquescodigo;

public class Bloquescodigo {

    public static void main(String[] args) {
        Persona p1 = new Persona();
        System.out.println("id: "+p1.getIdPersona());
        System.out.println("numero personas: "+Persona.getContadorPersonas());
    }    
}
