package Inicio;

import Objetos.Blanco;
import java.awt.Graphics;
import javax.swing.ImageIcon;

class Dinosaurio extends Blanco{
    /**
     * Metodo paint para mostar la imagen del Blanco
     *
     * @param g
     */
    @Override
    public void paint(Graphics g){
        ImageIcon Fondo = new ImageIcon(getClass().getResource("/Imagenes/dinosaurio.png"));
        g.drawImage(Fondo.getImage(), (int) x, (int) y, 130, 100, this);
    }
}
