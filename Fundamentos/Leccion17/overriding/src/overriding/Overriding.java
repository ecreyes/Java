package overriding;

public class Overriding {

    public static void main(String[] args) {
        Empleado e1 = new Empleado("Eduardo1",2000000);
        System.out.println(e1.obtenerDetalle());
        
        Gerente g1 = new Gerente("Eduardo2",3000000,"Java");
        System.out.println(g1.obtenerDetalle());
    }    
}
