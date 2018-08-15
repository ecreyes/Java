package abstracto.domain;

public class Circulo extends FiguraGeometrica {
    public Circulo(String tipoFigura){
        super(tipoFigura);
    }
    
    public void dibujar(){
        System.out.println("Aqui debería ir un "+this.getClass().getSimpleName());
    }
}
