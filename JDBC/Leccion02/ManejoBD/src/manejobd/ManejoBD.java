package manejobd;
import datos.PersonasJDBC;
import java.util.List;
import Modelo.Persona;
public class ManejoBD {
    public static void main(String[] args) {
        PersonasJDBC personaJDBC = new PersonasJDBC();
        //personaJDBC.insert("nombre_conexion", "apellido_conexion");
        //personaJDBC.delete(8);
        //personaJDBC.update(9, "test_update", "test_update");
        List<Persona> personas = personaJDBC.select();
        for(Persona p:personas){
            System.out.println(p);
        }
    }    
}
