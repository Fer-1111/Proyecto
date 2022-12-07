package Objetos;
import java.awt.Graphics;
import java.util.ArrayList;
public class ArrayMisiles{
    private final ArrayList<Misil> Misiles;

    public ArrayMisiles(){
        Misiles = new ArrayList<>();
    }
    public void addMisil(Misil m){
        Misiles.add(m);
    }
     public boolean estaVacio(){
        return Misiles.size() == 0;
    }
    public Misil getMisil() {
        return Misiles.remove(0);
    }
    public void paint(Graphics g){
        if(Misiles.size() > 0){
            Misiles.get(0).paint(g);
        }
        
    }
    public Misil arrayPosicionMisil(int i){
        return Misiles.get(i);
    }
}
