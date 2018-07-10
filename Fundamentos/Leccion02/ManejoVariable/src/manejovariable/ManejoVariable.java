package manejovariable;

public class ManejoVariable {
    public static void main(String[] args) {
        //Variables Boolean,declaración
        boolean bool1;
        //inicialización
        bool1 = true;
        //Declaración e iniciación
        boolean bool2;
        bool2 = false;
        System.out.println("Valor bool1: "+bool1);
        System.out.println("Valor bool2: "+bool2);
        System.out.println("");
        
        //Variables byte
        byte b1 = 10;
        //Literal en hexadecimal
        byte b2 = 0xa;
        System.out.println("Valor b1: "+b1);
        System.out.println("Valor b2: "+b2);
        System.out.println("");
        
        //Variable short
        short s1 = 2;
        System.out.println("Valor s1: "+s1);
        System.out.println("");
        
        //Variable Char,declaración e inicialización
        char ch1 = 65, ch2 = 'A';
        System.out.println("Valor ch1: "+ch1);
        System.out.println("Valor ch2: "+ch2);
        System.out.println("");
        
        //Variables enteras
        int decimal = 100;
        int octa = 0144; //valor octal empieza con 0
        int hexa = 0x64; //valor hexadecimal empieza con 0x
        System.out.println("Valor decimal: "+decimal);
        System.out.println("Valor octa: "+octa);
        System.out.println("Valor hexa: "+hexa);
        System.out.println("");
        
        //Variables Long
        long lg1 = 10, lg2 = 20L;
        System.out.println("Valor lg1: "+lg1);
        System.out.println("Valor lg2: "+lg2);
        System.out.println("");
        
        //Variables float
        float f1 = 15, f2 = 22.3F;
        System.out.println("Valor f1: "+f1);
        System.out.println("Valor f2: "+f2);
        System.out.println("");
        
        //Variables double
        double d1 = 11.0, d2 = 30.15D;
        System.out.println("Valor d1: "+d1);
        System.out.println("Valor d2: "+d2);
    }    
}
