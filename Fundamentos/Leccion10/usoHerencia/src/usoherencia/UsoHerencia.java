package usoherencia;

public class UsoHerencia {

    public static void main(String[] args) {
        Empleado p1 = new Empleado("Eduardo",23,1500000);
        System.out.println("Edad: "+p1.getEdad());
        p1.setEdad(20);
        System.out.println("Edad modificada: "+p1.getEdad());
        System.out.println("Nombre: "+p1.getNombre());
        System.out.println("Sueldo: "+p1.getSueldo());
        System.out.println("Saludo: "+p1.saludar());
        
        Persona p2 = new Persona("edu",23);
        System.out.println("Saludo persona: "+p2.saludar());
    }
    
}

class Persona{
    private String nombre;
    private int edad;
    
    public Persona(String nombre,int edad){
        this.nombre = nombre;
        this.edad = edad;
    }
    
    public void setNombre(String nombre){
        this.nombre= nombre;
    }
    public String getNombre(){
        return nombre;
    }
    
    public void setEdad(int edad){
        this.edad = edad;
    }
    
    public int getEdad(){
        return edad;
    }
    
    public String saludar(){
        return "Hola mundo!";
    }
}

class Empleado extends Persona{
    private int sueldo;
    public Empleado(String nombre,int edad,int sueldo){
        super(nombre,edad);
        this.sueldo = sueldo;        
    }
    
    public void setSueldo(int sueldo){
        this.sueldo = sueldo;
    }
    
    public int getSueldo(){
        return sueldo;
    }
    
    @Override
    public String saludar(){
        return super.saludar()+" soy Empleado :(";
    }
    
}
