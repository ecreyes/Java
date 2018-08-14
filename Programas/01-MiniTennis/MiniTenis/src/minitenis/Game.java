package minitenis;
//Jframe permite crear una ventana estandar en el SO.
import javax.swing.JFrame;
/*Para poder pintar en el JFrame se necesita un lienzo
  es decir un objeto JPanel */
import javax.swing.JPanel;
//Utilizados para pintar en el lienzo
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
//listener de keyboard
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
//para el game over
import javax.swing.JOptionPane;

public class Game extends JPanel{  
    Ball ball = new Ball(this);
    Racquet racquet = new Racquet(this);
    
    public Game() {
        addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
            }

            @Override
            public void keyReleased(KeyEvent e) {
                racquet.keyReleased(e);
            }

            @Override
            public void keyPressed(KeyEvent e) {
                racquet.keyPressed(e);
            }
        });
        setFocusable(true);
    }
    
    private void move() {
            ball.move();
            racquet.move();
    }

    /**
     * El motor AWT siempre va a llamar a paint de forma automática
     * cuando se necesite pintar el lienzo,se vuelva a abrir la ventana
     * etc.
     */
    @Override
    public void paint(Graphics g){
        //limpia la pantalla cada vez que se llama.
        super.paint(g);
        //crea un objeto de tipo Grpahics2D
        Graphics2D g2d = (Graphics2D) g;
        //suavizado de la pelota.
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
				RenderingHints.VALUE_ANTIALIAS_ON);
        ball.paint(g2d);
        racquet.paint(g2d);
    }
    
    public void gameOver() {
        JOptionPane.showMessageDialog(this, "Game Over", "Game Over", JOptionPane.YES_NO_OPTION);
        System.exit(ABORT);
    }

    
    public static void main(String[] args) throws InterruptedException {
        //crea una ventana con el nombre Mini Tennis
        JFrame frame = new JFrame("Mini Tennis");
        //se crea un objeto de la clase Game
        Game game = new Game();
        //añade el objeto game que es de tipo JPanel al frame.
        frame.add(game);
        //se asigna el ancho y alto de la ventana (x,y)
        frame.setSize(300, 400);
        //la ventana se hace visible
        frame.setVisible(true);
        //cuando se cierre la ventana la ejecución finalizará
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        //Bucle del juego
        while(true){
            game.move(); 
            //permite ejecutar el método paint tan pronto como pueda.
            game.repaint();
            Thread.sleep(10);
        }
    }    
}
