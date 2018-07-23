package ejemploconversionobjetos;

public class Escritor extends Empleado {
    final TipoEscritura tipoescritura;

    public Escritor(String nombre,int sueldo,TipoEscritura tipoescritura){
        super(nombre,sueldo);
        this.tipoescritura = tipoescritura;
    }
    
    @Override
    public String obtenerDetalle(){
        return super.obtenerDetalle()+" Tipo Escritura: "+tipoescritura.getDescripcion();
    }
    
    public TipoEscritura getTipoEscritura(){
        return tipoescritura;
    }

    public String getTipoEscrituraTexto(){
        return tipoescritura.getDescripcion();
    }
}
