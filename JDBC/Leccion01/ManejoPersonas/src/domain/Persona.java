package domain;

public class Persona {
    //columnas de la tabla de la BD persona
    private int id_persona;
    private String nombre;
    private String apellido;
    
    public int getId_Persona(){
        return id_persona;
    }
   
    public String getNombre(){
        return nombre;
    }
    public String getApellido(){
        return apellido;
    }
    
    public void setId_Persona(int id_persona){
        this.id_persona = id_persona;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public void setApellido(String apellido){
        this.apellido = apellido;
    }
    
    @Override
    public String toString(){
        return "Persona{"+"id_persona="+id_persona+", nombre="+nombre+
                ", apellido="+apellido+" }";
    }
}
