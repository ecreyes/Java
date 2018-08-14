package minitenis;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.event.KeyEvent;
import java.awt.Rectangle;

public class Racquet {
    private static final int Y = 330;
    private static final int WITH = 60;
    private static final int HEIGHT = 10;
    int x = 0;
    int xa = 0;
    private Game game;
    public Racquet(Game game){
        this.game = game;
    }
    
    public void move(){
        if (x + xa> 0 && x + xa < game.getWidth() - WITH) {
            x = x + xa;
        }        
    }
    
    public void paint(Graphics2D g){
        //se asigna un color
        g.setColor(Color.BLUE);
        //se pinta un rectangulo en (x,y,z,w)->x,y posicion z,w ancho y alto
       g.fillRect(x, Y, WITH, HEIGHT);       
    }
    public void keyReleased(KeyEvent e) {
        xa = 0;
    }
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_LEFT) {
            xa = -2;
        }
        if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
            xa = 2;
        }
    }
    public Rectangle getBounds() {
        return new Rectangle(x, Y, WITH, HEIGHT);
    }
}
