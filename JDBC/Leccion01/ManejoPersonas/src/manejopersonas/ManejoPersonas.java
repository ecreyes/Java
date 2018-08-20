package manejopersonas;

import datos.PersonasJDBC;
import domain.Persona;
import java.util.List;

public class ManejoPersonas {
    public static void main(String[] args) {
        PersonasJDBC personasJDBC = new PersonasJDBC();
        //personasJDBC.insert("Eduardo", "Reyes");
        //personasJDBC.update(2, "Ignacio","Reyes");
        //personasJDBC.delete(2);
        List<Persona> personas = personasJDBC.select();
        for(Persona p:personas){
            System.out.println(p);
        }
    }    
}
