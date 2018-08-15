package abstracto.domain;

public class Triangulo extends FiguraGeometrica{
    public Triangulo(String tipoFigura){
        super(tipoFigura);
    }
    public void dibujar(){
        System.out.println("Aquí deberia ir: "+this.getClass().getSimpleName());
    }
}
