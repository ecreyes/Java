package Main;

import Matematica.Aritmetica;

public class Main {
    public static void main(String args[]){
        Aritmetica a1 = new Aritmetica();
        int resultado = a1.sumar(2, 3);
        System.out.println("resultado: "+resultado);
    }
}
