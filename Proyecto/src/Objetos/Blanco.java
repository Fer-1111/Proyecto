package Objetos;

import java.awt.Graphics;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
/**
 * 
 * Blanco representa a un auto que será seguido por un misil 
 */
public class Blanco extends JLabel {

    public float x;
    public float y;
    public float velX;
    /**
     * En el constructor se ajustan las posiciones iniciales del Blanco
     */
    public Blanco() {
        x = 1265;
        y = 490;
    }

    /**
     * Metodo paint para mostar la imagen del Blanco
     *
     * @param g
     */
    @Override
    public void paint(Graphics g) {
        ImageIcon Fondo = new ImageIcon(getClass().getResource("/Imagenes/BlancoAuto.png"));
        g.drawImage(Fondo.getImage(), (int) x, (int) y, 150, 100, this);
    }

    /**
     * Ajusta una velocidad constante para que el blanco se mueva constante
     * hacia la izquierda
     */
    public void MoverBlancoIzquierda() {
        velX = -4f;
    }

    /**
     * Ajusta una velocidad constante del Blanco hacia la derecha
     */
    public void MoverBlancoDerecha() {
        velX = 4f;
    }

    /**
     * Define los limites por donde el blanco puede avanzar y moverse
     */
    public void LimiteDelMapaBlanco() {
        if (x <= -200) {
            x = 1250;
        }
        if (x >= 1265) {
            x = -195;
        }
    }

    /**
     * Devuelve la posicion en x
     *
     * @return
     */
    public float posicionX() {
        return x;
    }

    /**
     * Devuelve la posicion en y
     *
     * @return
     */
    public float posicionY() {
        return y;
    }
}
