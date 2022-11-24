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
     public int arrayLong(){
        return Misiles.size();
    }
    public Misil getBebida() {
        if (Misiles.size() <= 0) return null;
        else {
            Misil m = Misiles.remove(0);
            return m;
        }
    }
    public void paint(Graphics g){
        Misiles.get(0).paint(g);
    }
}
