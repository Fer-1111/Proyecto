package Objetos;

import java.awt.Graphics;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Avion extends JLabel{
    private ArrayMisiles MisilesAvion;
    float x = 1080;   // posicion x del avion
    float y = 0f;   //posicion y del avion
    
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
    
    public void MoverAvion(){
        x = x - 1;
        
    }
}
