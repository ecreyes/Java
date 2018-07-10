package personas;

public class Persona {
    public String nombre;
    public String apellidoPaterno;
    public String apellidoMaterno;
    
    public void desplegarNombre(){
        System.out.println("Nombre: "+this.nombre);
        System.out.println("Apellido Paterno: "+this.apellidoPaterno);
        System.out.println("Apellido Materno: "+this.apellidoMaterno);
    }  
    
}
