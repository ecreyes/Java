package ejemploconversionobjetos;

public class Gerente extends Empleado{
    private String departamento;
    public Gerente(String nombre,int sueldo,String departamento){
        super(nombre,sueldo);
        this.departamento = departamento;
    }
    
    @Override
    public String obtenerDetalle(){
        return super.obtenerDetalle()+" departamento: "+departamento;
    }
    
    public String getDepartamento(){
        return departamento;
    }
    public void setDepartamento(String departamento){
        this.departamento = departamento;
    }
}
