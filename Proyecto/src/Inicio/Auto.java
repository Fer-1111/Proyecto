package Inicio;

import Objetos.Blanco;
import java.awt.Graphics;
import javax.swing.ImageIcon;

/**
 *
 * @author Sergio Opazo Z
 */
class Auto extends Blanco{
    /**
     * Metodo paint para mostar la imagen del Auto
     *
     * @param g
     */
    public Auto(){
        
    }
    @Override
    public void paint(Graphics g){
        ImageIcon Fondo = new ImageIcon(getClass().getResource("/Imagenes/BlancoAuto.png"));
        g.drawImage(Fondo.getImage(), (int) x, (int) y, 130, 100, this);
    }
}
