package ejemploconversionobjetos;

public class EjemploConversionObjetos {

    public static void main(String[] args) {
        Empleado emp = new Escritor("Eduardo",100000,TipoEscritura.CLASICO);
        imprimirDetalles(emp);
        
        emp = new Gerente("Eduard2",100000,"Java");
        imprimirDetalles(emp);
    }

    private static void imprimirDetalles(Empleado empleado){
        String resultado = null;
        //imprimirDetalles es general para todos, no se necesita hacer conversion
        System.out.println("Detalle: "+empleado.obtenerDetalle());
        
        //para los detalles de cada clase se hace un downcasting
        if(empleado instanceof Escritor){
            resultado = ((Escritor)empleado).getTipoEscrituraTexto();
            System.out.println("resultado tipoEscritura: "+resultado);
        }
        else if(empleado instanceof Gerente){
            resultado = ((Gerente)empleado).getDepartamento();
            System.out.println("Departamento: "+resultado);
        }
    }
}
