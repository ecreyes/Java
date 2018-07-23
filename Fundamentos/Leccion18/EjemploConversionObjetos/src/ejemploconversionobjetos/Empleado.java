package ejemploconversionobjetos;

public class Empleado {
    protected String nombre;
    protected int sueldo;
    
    protected Empleado(String nombre,int sueldo){
        this.nombre = nombre;
        this.sueldo = sueldo;
    }
    
    public String obtenerDetalle(){
        return "Nombre: "+nombre+" sueldo: "+sueldo;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public int getSueldo(){
        return sueldo;
    }
    
    public void setSueldo(int sueldo){
        this.sueldo = sueldo;
    }
}
