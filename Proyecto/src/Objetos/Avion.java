package Objetos;

import java.awt.Graphics;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
/**
 * Avion representa tal como su nombre dice, a un avion, el cual tiene altura y velocidad predeterminada
 * 
 * @author fer
 */
public class Avion extends JLabel{
    
    public final ArrayMisiles MisilesAvion;
    public float x;
    public float y;
    public float velX;
    public float velY;
    /**
     * 
     * Crea un arreglo de misiles recibiendo como parametro una cantidad para el arreglo
     * @param cantMisiles 
     */
    public Avion(int cantMisiles){
        MisilesAvion = new ArrayMisiles();
        x = 1080;
        y = 0;
        velY = 4f;
        for(int iteradorMisil = 0; iteradorMisil < cantMisiles ; iteradorMisil++){
            MisilesAvion.addMisil(new Misil());
        }
    }
    
    @Override
    /**
     * Metodo paint para crear imagenes y dibujar el fondo
     */
    public void paint(Graphics g){
        ImageIcon Fondo = new ImageIcon(getClass().getResource("/Imagenes/avion.png"));
        g.drawImage(Fondo.getImage(), (int)x, (int)y, 200,60,this);
        
        MisilesAvion.paint(g);
        repaint();
    }
    /**
     * Verifica el estado del ArrayMisiles para decidir si lanza el misil
     */
    public void lanzarMisil(){
        if(!MisilesAvion.estaVacio()){
            MisilesAvion.arrayPosicionMisil(0).mover();
        }
    }
    /**
     * Recibe dos parametros y para ajustar el angulo de giro
     * @param a
     * @param b 
     */
    public void girarMisil(float a, float b){
        if(!MisilesAvion.estaVacio()){
            MisilesAvion.arrayPosicionMisil(0).girar(a, b);
        }
        
    }
    /**
     * metodo que sirve para detectar si el objetivo esta en frente
     * en relacion a la distancia de los puntos ingresados
     * @param a
     * @param b
     * @return 
     */
    public boolean checkBlanco(float a, float b){
        if(!MisilesAvion.estaVacio()){
            return MisilesAvion.arrayPosicionMisil(0).checkearObjectivo(a, b);
        }
        return false;
    }
    /**
     * Ajusta la posicion del avion a la izquierda
     */
    public void MoverAvionIzquierda(){
        velX = -4f;
        if(x == -200){
            x = 1265;
        }        
    }
    /**
     * Ajusta la posicion del avion a la derecha 
     */
    public void MoverAvionDerecha(){
        velX = 4f;
        if(x == -200){
            x = 1265;
        }        
    }
    /**
     * Ajusta la posicion del avion hacia arriba, con un tope de 0
     */
    public void MoverAvionArriba(){
        y = y - velY;
        if(y <= 0){           
          y = 0;
        }
    }
    /**
     * Ajusta la posicion del avion, asegurando que no baje al nivel de la tierra
     */
    public void MoverAvionAbajo(){
        y = y + velY;
        if(y >= 380){
          y = 380;
        }
    }
    /**
     * Ajusta los limites por donde se puede ajustar la posicion del avion
     */
    public void LimiteDelMapaAvion(){
        if(x <= -200){
            x = 1250;
        }
        if(x >= 1265){
            x = -195;
        }
    }
    /**
     * Devuelve la posicion en x
     * @return 
     */
    public float posicionX(){
        return x;
    }
    /**
     * Devuelve la posicion en y
     * @return 
     */
    public float posicionY(){
        return y;
    }
    
    
}
