package Main.matematica;

public class Aritmetica {
    public int a;
    public int b;
    
    public Aritmetica(int a,int b){
        this.a=a;
        this.b=b;        
    }
    
    public Aritmetica(){
        
    }
    
    public int sumar(int a,int b){
        return a+b;
    }
    
    public int sumar(){
        return this.a+this.b;
    }
    
}
