package paquete1;

public class Clase2 {
    
    public Clase2(){
        //Prueba constructores
        System.out.println("");
        //constructor publico
        new Clase1(1);
        //constructor protegido
        new Clase1(1,2);
        //constructor default o package
        new Clase1(1,2,3);
        //Constructor private
        // new Clase1(1,2,3,4);
        System.out.println("Constructor private acceso denegado");
    }
    
    public void pruebaDesdeClase2(){
        //Acceso a Clase1 desde Clase2
        Clase1 c1 = new Clase1();
        System.out.println("");
        System.out.println("atributo publico: "+c1.atrPublico);
        System.out.println("atributo protegido: "+c1.atrProtegido);
        System.out.println("atributo privado: No se puede acceder");
        System.out.println("atributo default: "+c1.atrPaquete);
        
        System.out.println("");
        System.out.println("metodo publico: "+c1.metodoPublico());
        System.out.println("metodo protegido: "+c1.metodoProtegido());
        System.out.println("metodo privado: acceso denegado");
        System.out.println("metodo default: "+c1.metodoPaquete());
    }    
}
