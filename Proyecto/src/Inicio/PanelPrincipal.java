package Inicio;

import Objetos.Avion;
import Objetos.Blanco;
import static Objetos.Misil.getRandomIntegerBetweenRange;
import Trignometricas.Vector2;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class PanelPrincipal extends JPanel implements KeyListener, ActionListener, MouseListener, MouseMotionListener{
   
    private final Avion av;
    private final Blanco bl;
    public Vector2 posicionMouse;
    public int contador;
    int cantMisiles;
    /**
     * El contructor se encanga de inicializar variavles y definir tamaños
     */
    public PanelPrincipal() {
        super();
        cantMisiles = 2;
        av = new Avion(cantMisiles);
        bl = new Blanco();
        posicionMouse = new Vector2(0,0);
        contador = 1;       
        setSize(1280, 720);
        Timer t = new Timer(1,this);
        t.start();    
    }
    
    @Override
    /**
     * se encarga de dibujar el fondo y los elementos como el avion y el blanco
     */
    public void paint(Graphics g){
        super.paint(g);
        
        ImageIcon Fondo = new ImageIcon(getClass().getResource("/Imagenes/fondo.jpg"));
        g.drawImage(Fondo.getImage(), 0, 0, 1280,660,this);
        
        av.paint(g);
        bl.paint(g);
        
        Toolkit.getDefaultToolkit().sync();
    }
        @Override
        /**
         * Se encarga de definir las teclas con las cuales se moveran los objetos
         */
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
       if(e.getExtendedKeyCode() == KeyEvent.VK_SPACE){
           if(contador == 1 && !av.MisilesAvion.estaVacio()){
                av.MisilesAvion.arrayPosicionMisil(0).velocidad = 5f;
                av.MisilesAvion.arrayPosicionMisil(0).angulo = (float) getRandomIntegerBetweenRange(40, 140);
                contador--;   
           }
           
       }
    }
        @Override
        
    public void mouseMoved(MouseEvent me) {
        posicionMouse.x = me.getX();
        posicionMouse.y = me.getY();
    }
    @Override
    /**
     * Defines los limites de los elementos, ademas de verificar el estado de arrayMisiles para asi mover las posiciones
     */
    public void actionPerformed(ActionEvent me){
       
        av.x = av.x + av.velX;
        bl.x = bl.x + bl.velX;
        if(contador == 1 && !av.MisilesAvion.estaVacio()){
            av.MisilesAvion.arrayPosicionMisil(0).x = (av.x+80) + av.velX;
            av.MisilesAvion.arrayPosicionMisil(0).y = (av.y+60) + av.velY;
        }
        bl.LimiteDelMapaBlanco();
        av.LimiteDelMapaAvion(); 
        
        if(av.checkBlanco(bl.posicionX(), bl.posicionY())){
            av.girarMisil(bl.posicionX(), bl.posicionY());
            if(!av.MisilesAvion.estaVacio()){
                av.MisilesAvion.getMisil();
                contador++;
            }
        }
        if(!av.MisilesAvion.estaVacio()){
            av.MisilesAvion.arrayPosicionMisil(0).mover();
        }
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
