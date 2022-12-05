package Inicio;

import Objetos.Avion;
import Objetos.Blanco;
import Objetos.Misil;
import Objetos.Vector2;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class PanelPrincipal extends JPanel implements KeyListener, ActionListener, MouseListener, MouseMotionListener{
    private final Avion av;
    private final Blanco bl;
    public Vector2 posicionMouse;
    public int contador = 0;
    public Misil m;
    
    public PanelPrincipal() {
        super();
        av = new Avion();
        bl = new Blanco();
        setLayout(null);
        setSize(1280, 720);
        setVisible(true);
        Timer t = new Timer(16,this);
        t.start();
        
        posicionMouse = new Vector2(0,0);
        m = new Misil();
        
    }
    public void paint(Graphics g){
        super.paint(g);
    
        ImageIcon Fondo = new ImageIcon(getClass().getResource("/Imagenes/fondo.jpg"));
        g.drawImage(Fondo.getImage(), 0, 0, 1280,660,this);
        av.paint(g);
        bl.paint(g);
        //Toolkit.getDefaultToolkit().sync();
       // g.dispose();
        g.fillOval((int)posicionMouse.x - 5, (int)posicionMouse.y -5, 10, 10);
        m.paint(g);
    }
    
    @Override
    public void keyTyped(KeyEvent e) {
       
    }

    @Override
    public void keyPressed(KeyEvent e) {
        if(e.getExtendedKeyCode() == KeyEvent.VK_LEFT){          
           bl.MoverBlancoIzquierda();
                    
       }
       if(e.getExtendedKeyCode() == KeyEvent.VK_RIGHT){
           bl.MoverBlancoDerecha();
       }
       if(e.getKeyChar() == 'a' || e.getKeyChar() == 'A'){
           av.MoverAvionIzquierda();
       }
       if(e.getKeyChar() == 'd' || e.getKeyChar() == 'D'){
           av.MoverAvionDerecha();
       }
       if(e.getKeyChar() == 'w' || e.getKeyChar() == 'W'){
           av.MoverAvionArriba();
       }
       if(e.getKeyChar() == 's' || e.getKeyChar() == 'S'){
           av.MoverAvionAbajo();
       }

    }

    public void keyReleased(KeyEvent e) {
         
    }

    
    public void mouseClicked(MouseEvent me) {
                m.mover(); 
    }

    
    public void mousePressed(MouseEvent me) {
 
    }

    
    public void mouseReleased(MouseEvent me) {
   
    }

    
    public void mouseEntered(MouseEvent me) {
       
    }

    
    public void mouseExited(MouseEvent me) {
        
    }

    
    public void mouseDragged(MouseEvent me) {
       
    }
    
    public void mouseMoved(MouseEvent me) {
        posicionMouse.x = me.getX();
        posicionMouse.y = me.getY();
                m.mover(); 
    }
    public void actionPerformed ( ActionEvent ae){ //deber ir actualizando todo, avion 
       
        av.x = av.x + av.velXAvion;
        bl.x = bl.x + bl.velXBlanco;
        bl.LimiteDelMapaBlanco();
        av.LimiteDelMapaAvion();
        m.mover(); 
        System.out.println(m.checkearObjectivo(posicionMouse.x, posicionMouse.y));
        if(m.checkearObjectivo(posicionMouse.x, posicionMouse.y)){
            m.girar(posicionMouse.x, posicionMouse.y);
            System.out.println("pase x aca");
            
        }
        repaint();
        
        
        
    }
    
    
}
