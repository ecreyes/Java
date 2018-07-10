package manejooperadores;

public class ManejoOperadores {
    public static void main(String[] args) {
        System.out.println("Operadores aritmeticos");
        int a = 1+2;
        int b = a*4;
        int c = b/2;
        int d = c-a;
        int e = -d;
        System.out.println("Valor de a: "+a);
        System.out.println("Valor de b: "+b);
        System.out.println("Valor de c: "+c);
        System.out.println("Valor de d: "+d);
        System.out.println("Valor de e: "+e);
        
        System.out.println("\nOperador módulo residuo");
        System.out.println("b mod 2: "+b%2);
        
        System.out.println("\nOperador compuesto");
        // a = a +4
        a += 2;
        b -= 4;
        c *= a;
        System.out.println("a: "+a);
        System.out.println("b: "+b);
        System.out.println("c: "+c);
        
        System.out.println("\nOperador incremento");
        // a = a+1
        a++;
        System.out.println("a: "+a);
        
        System.out.println("\n Pre-post incremento/decremento");
        
        //Pre-incremento,Pre-decremento(se incrementa antes de asignar el valor)
        //Post-incremento,Post-decremento(se incrementa despues de asignar el valor)
        System.out.println("a: "+a);
        System.out.println("c: "+c);
        c = ++a;
        System.out.println("c: "+c);
        c = a++;
        System.out.println("c: "+c);
        System.out.println("a: "+a);
        
        System.out.println("\nOperador relacional");
        a = 2;
        b = 3;
        boolean rel = a < b;
        System.out.println("rel: "+rel);
        System.out.println("\nOperador ternario");
        int min = (a<b)? a:b;
        System.out.println("min: "+min);
        
        System.out.println("\nOperador de asignacion");
        int i,j,k;
        i = j = k = 100;
        System.out.println("i: "+i);
        System.out.println("j: "+j);
        System.out.println("k: "+k);
        
        
    }    
}
