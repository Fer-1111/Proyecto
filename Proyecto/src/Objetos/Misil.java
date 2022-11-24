package Objetos;

import java.awt.Graphics;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Misil extends JLabel{
    float x = 0f;   // posicion x del misil
    float y = 0f;   //posicion y del misil
    float angle = 0f;   // angulo (en grados) del misil
    public Misil(){
        
    }
    @Override
    public void paint(Graphics g){
        ImageIcon Fondo = new ImageIcon(getClass().getResource("/Imagenes/misil.png"));
        g.drawImage(Fondo.getImage(), 0, 0, 100,50,this);
    }
}
