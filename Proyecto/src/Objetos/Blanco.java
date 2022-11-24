package Objetos;

import java.awt.Graphics;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Blanco extends JLabel{
    
    float x = 0f;   // posicion x del blanco
    float y = 0f;   //posicion y del blanco, con y fijo sobre el suelo
    @Override
    public void paint(Graphics g){
        ImageIcon Fondo = new ImageIcon(getClass().getResource("/Imagenes/BlancoAuto.jpg"));
        g.drawImage(Fondo.getImage(), 100, 300, 100,50,this);
    }
}
