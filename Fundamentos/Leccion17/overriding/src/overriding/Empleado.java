package overriding;

public class Empleado {
    protected String nombre;
    protected int sueldo;
    
    protected Empleado(String nombre,int sueldo){
        this.nombre = nombre;
        this.sueldo = sueldo;
    }
    
    public String obtenerDetalle(){
        return "Nombre: "+nombre+" Sueldo: "+sueldo;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public int getSueldo(){
        return sueldo;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public void setSueldo(int sueldo){
        this.sueldo = sueldo;
    }
}
