package Objetos;

import java.awt.Graphics;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Avion extends JLabel{
    private ArrayMisiles MisilesAvion;
    public float x = 1080;   // posicion x del avion
    float y = 0;   //posicion y del avion
    float posY = 5f;
    public float velXAvion;
    
    public Avion(){
        
        MisilesAvion = new ArrayMisiles();
        for(int i = 0 ; i < 1 ; i++){
            MisilesAvion.addMisil(new Misil());
        }
    }
    @Override
    public void paint(Graphics g){
        ImageIcon Fondo = new ImageIcon(getClass().getResource("/Imagenes/avion.jpg"));
        g.drawImage(Fondo.getImage(), (int)x, (int)y, 200,60,this);
        MisilesAvion.paint(g);
    }    
    public Misil LanzarMisil(){
        return null;
    }
    public int CantMisiles(){
        return MisilesAvion.arrayLong();
    }
    
    public void MoverAvionIzquierda(){
        velXAvion = -2;
        if(x == -200){
            x = 1265;
        }        
    }
    public void MoverAvionDerecha(){
        velXAvion = 2;
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
