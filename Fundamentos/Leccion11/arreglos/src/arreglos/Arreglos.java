package arreglos;

public class Arreglos {

    public static void main(String[] args) {
        int[] numeros = new int[4];
        numeros[0] = 10;
        numeros[1] = 20;
        numeros[2] = 30;
        numeros[3] = 40;
        System.out.println("largo: "+numeros.length);
        
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("numero: "+numeros[i]);
        }
        
        String[] nombres = new String[3];
        nombres[0] = "Eduardo";
        nombres[1] = "Carlos";
        nombres[2] = "Ignacio";
        
        for (int i = 0; i < nombres.length; i++) {
            System.out.println("nombre"+i+": "+nombres[i]);            
        }
        
        Persona p3 = new Persona('M');
        
        Persona[] personas = new Persona[3];
        personas[0] = new Persona('M');
        personas[1] = new Persona('F');
        personas[2] = p3;
        
        for (int i = 0; i < personas.length; i++) {
            System.out.println("Persona"+i+" :"+personas[i].getGenero());            
        }
        
    }    
}

class Persona{
    private char genero;
    
    Persona(char genero){
        this.genero = genero;
    }
    
    public void setGenero(char genero){
        this.genero = genero;
    }
    
    public char getGenero(){
        return genero;
    }
}
