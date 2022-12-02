package Inicio;

import Objetos.Avion;
import Objetos.Blanco;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class PanelPrincipal extends JPanel implements KeyListener, ActionListener{
    private final Avion av;
    private final Blanco bl;
    private JTextArea jTextArea = null;
    public PanelPrincipal() {
        super();
        av = new Avion();
        bl = new Blanco();
        setLayout(null);
        setSize(1280, 720);
        setVisible(true);
        Timer t = new Timer(1,this);
        t.start();
        
    }
    @Override
    public void paint(Graphics g){
        super.paint(g);
    
        ImageIcon Fondo = new ImageIcon(getClass().getResource("/Imagenes/fondo.jpg"));
        g.drawImage(Fondo.getImage(), 0, 0, 1280,660,this);
        av.paint(g);
        bl.paint(g);
        Toolkit.getDefaultToolkit().sync();
        g.dispose();
        repaint();
    }
    
    @Override
    public void keyTyped(KeyEvent e) {
       
    }

    @Override
    public void keyPressed(KeyEvent e) {
        if(e.getKeyChar() == 'a' || e.getKeyChar() == 'A' || e.getExtendedKeyCode() == KeyEvent.VK_LEFT){          
           bl.MoverBlancoIzquierda();
       }
       if(e.getKeyChar() == 'd' || e.getKeyChar() == 'D' || e.getExtendedKeyCode() == KeyEvent.VK_RIGHT){
           bl.MoverBlancoDerecha();
       }
       if(e.getKeyChar() == 'w' || e.getKeyChar() == 'W' || e.getExtendedKeyCode() == KeyEvent.VK_UP){
           av.MoverAvionArriba();
       }
       if(e.getKeyChar() == 's' || e.getKeyChar() == 'S' || e.getExtendedKeyCode() == KeyEvent.VK_DOWN){
           av.MoverAvionAbajo();
       }

    }

    @Override
    public void keyReleased(KeyEvent e) {
         
    }
    
    public void actionPerformed ( ActionEvent ae){ //deber ir actualizando todo, avion 
       
        av.MoverAvion();
        //bl.MoverBlancoIzquierda();
        //bl.MoverBlancoDerecha();
        bl.x = bl.x + bl.velX;
        bl.LimiteDelMapa();
        
        repaint();
        
        //System.out.println("Holi");
    }
    
    
}
