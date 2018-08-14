package minitenis;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Rectangle;

public class Ball {
    private static final int DIAMETER = 30;
    //posicion espacial
    int x=0,y=0;
    int xa = 1; //si es 1 pelota a la derecha, si es -1 pelota a la izqueirda
    int ya = 1; //si es 1 pelota se mueve hacia abajo, si es -1 hacia arriba
    /* objeto de tipo Game de Jpanel, se utiliza para pasar el ancho de la
        ventana al método move de  Ball. */    
    private Game game; 
    
    public Ball(Game game){
        this.game = game;
    }
    
    public void move(){
        if(x+xa>game.getWidth()-DIAMETER)
            xa = -1;
        if(x+xa<0)
            xa = 1;
        if(y+ya>game.getHeight()-DIAMETER)
            game.gameOver();
        if(y+ya<0)
            ya = 1;
        if (collision()) {
            ya = -1;
        }
        x = x+xa;
        y = y+ya;
    }
    
    private boolean collision() {
        return game.racquet.getBounds().intersects(getBounds());
    }
    
    public void paint(Graphics2D g){
        //se asigna un color
        g.setColor(Color.RED);
        //se pinta un circulo en (x,y,z,w)->x,y posicion z,w ancho y alto
        g.fillOval(x, y, DIAMETER, DIAMETER);
    }
    
    public Rectangle getBounds() {
        return new Rectangle(x, y, DIAMETER, DIAMETER);
    }
    
}
