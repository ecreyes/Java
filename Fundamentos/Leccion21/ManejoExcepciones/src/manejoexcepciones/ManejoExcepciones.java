package manejoexcepciones;
import domain.*;
public class ManejoExcepciones {
    public static void main(String[] args) {
        try{
            Division division = new Division(10,0);
            division.visualizarOperacion();
        }catch(OperationException oe){
            System.out.println("Ocurrio un error!");
            oe.printStackTrace();
        }
    }    
}
