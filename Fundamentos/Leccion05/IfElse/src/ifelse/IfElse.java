package ifelse;

public class IfElse {
    public static void main(String[] args) {
        int x = 100;
        if(x <= 10){
            System.out.println("X es menor o igual a 10");
        } else if(x>10 && x<20){
            System.out.println("X esta entre 11 y 19");
        }else{
            System.out.println("X es mayor o igual a 20");
        }
    }    
}
