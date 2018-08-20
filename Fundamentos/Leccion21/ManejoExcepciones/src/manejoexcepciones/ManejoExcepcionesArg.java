package manejoexcepciones;
import domain.*;
public class ManejoExcepcionesArg {
    public static void main(String[] args) throws OperationException{
        try{
            int op1 = Integer.parseInt(args[0]);
            int op2 = Integer.parseInt(args[1]);
            Division div = new Division(op1,op2);
            div.visualizarOperacion();
        }catch(ArrayIndexOutOfBoundsException aie){
            System.out.println("Ocurrio una excepcion");
            System.out.println("Error al acceder elemento fuera del arreglo");
            aie.printStackTrace();
        }catch(NumberFormatException nfe){
            System.out.println("Ocurrio una excepcion:");
            System.out.println("uno de los argumentos no es entero");
            nfe.printStackTrace();
        }catch(OperationException oe){
            System.out.println("Ocurrio una excepcion:");
            System.out.println("se trató de hacer una operación erronea");
            oe.printStackTrace();
        }finally{
            System.out.println("Se terminó de revisar las excepciones");
        }        
    }
}
