package Objetos;

import java.awt.Graphics;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Blanco extends JLabel{
    
    public float x = 1265;   // posicion x del blanco
    public float y = 489;   //posicion y del blanco, con y fijo sobre el suelo
    public float velX;
    @Override
    public void paint(Graphics g){
        ImageIcon Fondo = new ImageIcon(getClass().getResource("/Imagenes/BlancoAuto.jpg"));
        g.drawImage(Fondo.getImage(), (int)x,(int)y , 200,150,this);
    }
    
    public void MoverBlancoIzquierda(){
        velX = -5f;
    }

    public void MoverBlancoDerecha(){
        velX = 5f;           
    }
    public void LimiteDelMapa(){
        if(x <= -200){
            x = 1250;
        }
        if(x >= 1265){
            x = -195;
        }
    }
}
