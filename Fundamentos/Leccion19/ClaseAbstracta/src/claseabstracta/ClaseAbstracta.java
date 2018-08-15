package claseabstracta;

import abstracto.domain.*;

public class ClaseAbstracta {
    public static void main(String[] args) {
       FiguraGeometrica triangulo = new Triangulo("Triangulo");
       FiguraGeometrica circulo = new Circulo("Circulo");
       FiguraGeometrica rectangulo = new Rectangulo("Rectangulo");
       
       rectangulo.dibujar();
       circulo.dibujar();
       triangulo.dibujar();
    }    
}
