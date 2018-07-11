package Main;

import Main.matematica.Aritmetica;

public class Main {
    public static void main(String args[]){
        Aritmetica obj = new Aritmetica(2,3);
        Aritmetica obj2 = new Aritmetica();
        System.out.println("sumar números objeto: "+obj.sumar());
        System.out.println("sumar números: "+obj.sumar(7,8));
        System.out.println("obj2: "+obj2.sumar());
    }
}
