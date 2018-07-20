package paquete2;

import paquete1.Clase1;

public class Clase3 extends Clase1{
    
    public Clase3(){
        //Constructor protegido, al ser una subclase puede acceder
        //aunque este en otro paquete.
        super(1,2);
        //Acceso a default denegado por estar en otro paquete.
        //super(1,2,3);
        //privado denegado
        //super(1,2,3,4);
    }
    
    public void pruebaDesdeClase3(){
        Clase1 c1 = new Clase1();
        //atributos
        System.out.println("");
        System.out.println("atributo publico: "+c1.atrPublico+" o heredado "+atrPublico);
        System.out.println("atributo protedigo: heredado:"+atrProtegido);
        System.out.println("atributo private: no se puede acceder");
        System.out.println("atributo default: no se puede acceder,fuera de paquete");
        //constructor publico
        new Clase1();
        //Los demas constructores no se pueden probar asi, sino desde el constructor
        //de esta clase, ya que es una sub clase en otro paquete.
        
        //Metodos
        System.out.println("");
        System.out.println("metodo publico: "+c1.metodoPublico());
        System.out.println("metodo protegido: "+metodoProtegido());
        System.out.println("metodo privado: acceso denegado");
        System.out.println("metodo default: acceso denegado fuera de paquete");
    }
}
