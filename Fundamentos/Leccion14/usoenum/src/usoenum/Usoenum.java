package usoenum;

public class Usoenum {

    public static void main(String[] args) {
        System.out.println("Valor 1: "+Dias.LUNES);
        indicarDia(Dias.LUNES);
        System.out.println("");
        System.out.println("Continente número 4: "+Continentes.AMERICA);
        System.out.println("Paises en AMERICA: "+Continentes.AMERICA.getPaises());
        indicarPais(Continentes.EUROPA);
        System.out.println("");
        imprimirContinentes();
    }   
    
    public static void indicarDia(Dias dia){
        switch(dia){
            case LUNES:
                System.out.println("Primer dia de la semana");
                break;
        }            
    }
    
    public static void indicarPais(Continentes continente){
        switch(continente){
            case EUROPA:
                System.out.println("contiente: "+continente+" paises: "+continente.getPaises());
                break;
        }
    }
    
    public static void imprimirContinentes(){
        //El método .values() permite obtener todos los valores de la enumeración.
        for(Continentes c: Continentes.values()){
            System.out.println("Contiente: "+c+" paises: "+c.getPaises());
        }
    }
}
