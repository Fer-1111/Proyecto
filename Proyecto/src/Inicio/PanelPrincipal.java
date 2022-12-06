package Inicio;

import Objetos.Avion;
import Objetos.Blanco;
import Trignometricas.Vector2;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class PanelPrincipal extends JPanel implements KeyListener, ActionListener, MouseListener, MouseMotionListener{
   
    private final Avion av;
    private final Blanco bl;
    public Vector2 posicionMouse;
    public int contador;
    
    public PanelPrincipal() {
        super();
        int cantMisiles = 10;
        av = new Avion(10);
        bl = new Blanco();
        posicionMouse = new Vector2(0,0);
        contador = 0;
        
        setSize(1280, 720);
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
        @Override
    public void mouseMoved(MouseEvent me) {
        posicionMouse.x = me.getX();
        posicionMouse.y = me.getY();
    }
    @Override
    public void actionPerformed ( ActionEvent me){
       
        av.x = av.x + av.posX;
        bl.x = bl.x + bl.velX;
        bl.LimiteDelMapaBlanco();
        av.LimiteDelMapaAvion(); 
        
        if(av.checkBlanco(bl.posicionX(), bl.posicionY())){
            av.girarMisil(bl.posicionX(), bl.posicionY());
        }
        
        av.lanzarMisil();
        repaint();  
    }
    @Override
    public void keyTyped(KeyEvent e){}
    @Override
    public void keyReleased(KeyEvent e){}
    @Override
    public void mouseClicked(MouseEvent me){}
    @Override
    public void mousePressed(MouseEvent me){}
    @Override
    public void mouseReleased(MouseEvent me){}
    @Override
    public void mouseEntered(MouseEvent me){}
    @Override
    public void mouseExited(MouseEvent me){}
    @Override
    public void mouseDragged(MouseEvent me){}
}
