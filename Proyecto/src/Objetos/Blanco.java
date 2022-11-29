package Objetos;

import java.awt.Graphics;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Blanco extends JLabel{
    
    float x = 1000;   // posicion x del blanco
    float y = 489;   //posicion y del blanco, con y fijo sobre el suelo
    @Override
    public void paint(Graphics g){
        ImageIcon Fondo = new ImageIcon(getClass().getResource("/Imagenes/BlancoAuto.jpg"));
        g.drawImage(Fondo.getImage(), (int)x,(int)y , 200,150,this);
    }
    
    public void Mover(){
        x = x - 0.8f;
    }
}
