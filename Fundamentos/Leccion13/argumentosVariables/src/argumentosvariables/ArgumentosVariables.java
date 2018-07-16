package argumentosvariables;

public class ArgumentosVariables {
    public static void main(String[] args) {
        imprimirNumeros(10,20);
        System.out.println("");
        imprimirNumeros(1,2,3,4,5,6,7,8);
        System.out.println("");
        imprimirNumerosEach(21,22,23);
        System.out.println("");
        variosParametros("Eduardo",true,5,6,7,8);
    }

    public static void imprimirNumeros(int... numeros){
        int elemento;
        for (int i = 0; i < numeros.length; i++) {
            elemento = numeros[i];
            System.out.println("numero: "+elemento);
        }
    }
    
    public static void imprimirNumerosEach(int... numeros){
        for(int elemento:numeros){
            System.out.println("numero: "+elemento);            
        }
    }
    
    public static void variosParametros(String nombre,boolean valido,int... numeros){
        System.out.println("Nombre: "+nombre);
        System.out.println("Valido: "+valido);
        for(int elemento:numeros){
            System.out.println("numero: "+elemento);
        }
    }
}
