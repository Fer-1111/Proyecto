package Objetos;

import java.awt.Graphics;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Blanco extends JLabel{
    
    public float x = 1265;   // posicion x del blanco
    public float y = 489;   //posicion y del blanco, con y fijo sobre el suelo
    public float velXBlanco;
    @Override
    public void paint(Graphics g){
        ImageIcon Fondo = new ImageIcon(getClass().getResource("/Imagenes/BlancoAuto.png"));
        g.drawImage(Fondo.getImage(), (int)x,(int)y , 150,100,this);
    }
    
    public void MoverBlancoIzquierda(){
        velXBlanco = -5f;
    }

    public void MoverBlancoDerecha(){
        velXBlanco = 5f;           
    }
    public void LimiteDelMapaBlanco(){
        if(x <= -200){
            x = 1250;
        }
        if(x >= 1265){
            x = -195;
        }
    }
}
