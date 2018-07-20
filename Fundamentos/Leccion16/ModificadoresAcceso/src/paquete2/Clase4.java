package paquete2;
import paquete1.Clase1;

public class Clase4 {
    public Clase4(){
        //constructor protegido restringido al no ser una subclase
        //constructor default restringido al estar fuera del paquete
        //constructor privado restringido     
    }
    
    public void pruebaDesdeClase4(){
        Clase1 c1 = new Clase1();
        //atributos
        System.out.println("");
        System.out.println("atributo publico: "+c1.atrPublico);
        System.out.println("atributos protected,default,private denegado");
        //constructor publico
        new Clase1(1);
        
        //metodos
        System.out.println("");
        System.out.println("metodo publico: "+c1.metodoPublico());
        System.out.println("metodos protected,default,private denegado");        
    }
    
}
