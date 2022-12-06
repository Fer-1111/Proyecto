package Objetos;

import java.awt.Graphics;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Blanco extends JLabel{
    
    public float x ;
    public float y;
    public float velX;
    public Blanco(){
        x = 1265;
        y = 490;
    }

    /**
     *
     * @param g
     */
    @Override
    public void paint(Graphics g){
        ImageIcon Fondo = new ImageIcon(getClass().getResource("/Imagenes/BlancoAuto.png"));
        g.drawImage(Fondo.getImage(), (int)x,(int)y , 150,100,this);
    }
    
    public void MoverBlancoIzquierda(){
        velX = -1f;
    }

    public void MoverBlancoDerecha(){
        velX = 1f;           
    }
    public void LimiteDelMapaBlanco(){
        if(x <= -200){
            x = 1250;
        }
        if(x >= 1265){
            x = -195;
        }
    }
    public float posicionX(){
        return x;
    }
    public float posicionY(){
        return y;
    }
}
