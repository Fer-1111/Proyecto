package Objetos;

import java.awt.Graphics;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Avion extends JLabel{
    
    private final ArrayMisiles MisilesAvion;
    public float x;
    public float y;
    public float posY;
    public float posX;
    
    public Avion(int cantMisiles){
        MisilesAvion = new ArrayMisiles();
        x = 1080;
        y = 0;
        for(int iteradorMisil = 0; iteradorMisil < cantMisiles ; iteradorMisil++){
            MisilesAvion.addMisil(new Misil(true,posX,posY));
        }
    }
    
    @Override
    public void paint(Graphics g){
        ImageIcon Fondo = new ImageIcon(getClass().getResource("/Imagenes/avion.png"));
        g.drawImage(Fondo.getImage(), (int)x, (int)y, 200,60,this);
        
        MisilesAvion.paint(g);
        repaint();
    }
    
    public void lanzarMisil(){
        
        MisilesAvion.arrayPosicionMisil(0).mover();
        
    }
    public void girarMisil(float a, float b){
        
        MisilesAvion.arrayPosicionMisil(0).girar(a, b);
        
    }
    public boolean checkBlanco(float a, float b){
        
        return MisilesAvion.arrayPosicionMisil(0).checkearObjectivo(a, b);
        
    }
    public void MoverAvionIzquierda(){
        posX = -2;
        if(x == -200){
            x = 1265;
        }        
    }
    public void MoverAvionDerecha(){
        posY = 2;
        if(x == -200){
            x = 1265;
        }        
    }
    public void MoverAvionArriba(){
        y = y - posY;
        if(y <= 0){           
          y = 0;
        }
    }
    public void MoverAvionAbajo(){
        y = y + posY;
        if(y >= 380){
          y = 380;
        }
    }
    public void LimiteDelMapaAvion(){
        if(x <= -200){
            x = 1250;
        }
        if(x >= 1265){
            x = -195;
        }
    }
}
