package abstracto.domain;

public class Rectangulo extends FiguraGeometrica{
    public Rectangulo(String tipoFigura){
        super(tipoFigura);
    }
    
    public void dibujar(){
        System.out.println("aquí deberia ir un: "+this.getClass().getSimpleName());
    }
    
}
