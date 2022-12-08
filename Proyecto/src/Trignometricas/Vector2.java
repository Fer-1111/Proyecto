package Trignometricas;
/**
 * 
 * Se encarga de trabajar con los vectores, de definir su magnitud y de normalizar
 */
public class Vector2{
    public float x,y;
    
    public Vector2(float x, float y){
        this.x = x;
        this.y = y;
    }
    
    public static float dot(Vector2 a, Vector2 b){
        return a.x * b.x + a.y * b.y;
    }
    
    public void escalar(float f){
        x *= f;
        y *= f;
    }
    
    public float magnitud(){
        return (float)Math.sqrt(x*x + y*y);
    }
    
    public void normalizar(){
        float mag = magnitud();
        x /= mag;
        y /= mag;
    }
}
