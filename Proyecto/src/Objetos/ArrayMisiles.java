package Objetos;
import java.awt.Graphics;
import java.util.ArrayList;
public class ArrayMisiles{
    private final ArrayList<Misil> Misiles;
/**
 * Se encarga de crear un Arreglo para guardar los misiles
 */
    public ArrayMisiles(){
        Misiles = new ArrayList<>();
    }
    /**
     * Recibe un parametro para agregarlo al array de Misiles
     * @param m 
     */
    public void addMisil(Misil m){
        Misiles.add(m);
    }
    /**
     * Verifica el estado del Array de misiles
     * @return 
     */
     public boolean estaVacio(){
        return Misiles.size() == 0;
    }
     /**
      * retorna el misil pedido
      * @return 
      */
    public Misil getMisil() {
        return Misiles.remove(0);
    }
    /**
     * Se encarda de dibujar el misil
     * @param g 
     */
    public void paint(Graphics g){
        if(Misiles.size() > 0){
            Misiles.get(0).paint(g);
        }
        
    }
    /**
     * Recibe un parametro para luego retornar la posicion del misil
     * @param i
     * @return 
     */
    public Misil arrayPosicionMisil(int i){
        return Misiles.get(i);
    }
}
