package Objetos;
import java.awt.Graphics;
import javax.swing.JLabel;
/**
 * 
 * Blanco representa a un auto que será seguido por un misil 
 */
public abstract class Blanco extends JLabel {

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
     * Ajusta una velocidad constante para que el blanco se mueva constante
     * hacia la izquierda
     */
    @Override
    public abstract void paint(Graphics g);
    
    public void MoverBlancoIzquierda() {
        velX = -getRandomIntegerBetweenRange();
    }

    /**
     * Ajusta una velocidad constante del Blanco hacia la derecha
     */
    public void MoverBlancoDerecha() {
        velX = getRandomIntegerBetweenRange();
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
    public static float getRandomIntegerBetweenRange(){
        float max = 10f;
        float min = 1f;
        float x = (int)(Math.random()*((max-min)+1))+min;
        return x;
    }
}
