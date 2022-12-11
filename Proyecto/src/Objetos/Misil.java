package Objetos;

import Trignometricas.Angular;
import Trignometricas.Vector2;
import Inicio.Ventana;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.Polygon;

public class Misil{
    
    public float x;
    public float y;
    public float angulo;
    public float radio;
    private float velAngular;
    public float velocidad;
    private float t;
    public float velX;
    public float velY;
    /**
     * El constructor se encarfa de ajustar las posiciones, el angulo y el radio del misil, ademas de la velocidad
     */
    public Misil(){
        x = 1170;
        y = 60;
        angulo = 180;
        radio = 350;
        velAngular = 5f;
        t = 10f;
        velX=1f;
        velY=1f;
    }
    
    /**
     * Se encarga de crear el ovalo que funcionara para detectar objetos dentro del radio
     * @param g 
     */
    public void paint(Graphics g){
        g.setColor(Color.black);
        //g.drawOval((int) (x - radio), (int) (y - radio), (int) radio * 2, (int) radio * 2);
        Polygon poly = new Polygon();
      
        Point p = Angular.generaPunto((int)x, (int)y, t * 2, -angulo);
        poly.addPoint(p.x, p.y);
        
        p = Angular.generaPunto((int)x, (int)y, t, -angulo + 30);
        poly.addPoint(p.x, p.y);
        
        p = Angular.generaPunto((int)x, (int)y, t, -angulo + 150);
        poly.addPoint(p.x, p.y);
        
        p = Angular.generaPunto((int)x, (int)y, t * 2, -angulo + 150);
        poly.addPoint(p.x, p.y);
        
        p = Angular.generaPunto((int)x, (int)y, t * 2, -angulo - 150);
        poly.addPoint(p.x, p.y);
        
        p = Angular.generaPunto((int)x, (int)y, t, -angulo - 150);
        poly.addPoint(p.x, p.y);
        
        p = Angular.generaPunto((int)x, (int)y, t, -angulo - 30);
        poly.addPoint(p.x, p.y);
        
        g.setColor(Color.white);
        g.fillPolygon(poly);
        
        g.setColor(Color.black);
        g.drawPolygon(poly);
        
        
        
    }
    /**
     * recibe dos parametros y se encarga de retornar true si el objeto esta frente al misil
     * @param x
     * @param y
     * @return 
     */
    public boolean checkearObjectivo(float x, float y) {
        Vector2 dist = new Vector2(x - this.x, y - this.y);
        float mag = dist.magnitud();
        if (mag > radio) {
            return false;
        }

        Vector2 frente = new Vector2((float) Math.cos(Math.toRadians(angulo)), (float) Math.sin(Math.toRadians(angulo)));

        dist.normalizar();
        frente.normalizar();

        // si el objetivo esta frente al misil, entonces retornar verdadero
        if(Vector2.dot(dist, frente) > 0f){
            return true;
        } // sino, descartar
        else return false;
    }
    /**
     * recibe dos parametros y segun estos ajusta el angulo de giro
     * @param x
     * @param y 
     */
    public void girar(float x, float y) {
        Vector2 dist = new Vector2(x - this.x, y - this.y);

        // pasamos el angulo a Vector en 2 dimensiones
        float anguloObjetivo = (float) Math.toDegrees(Math.atan2(dist.y, dist.x));

        // encontrar la direccion con menor dif de angulo
        float delta = anguloObjetivo - angulo;
        float delta2 = anguloObjetivo - angulo - 360f;
        float delta3 = anguloObjetivo - angulo + 360f;
        if (Math.abs(delta2) < Math.abs(delta) && Math.abs(delta2) < Math.abs(delta3)) {
            delta = delta2;
        }
        if (Math.abs(delta3) < Math.abs(delta) && Math.abs(delta3) < Math.abs(delta2)) {
            delta = delta3;
        }

        // si la diferencia de angulo es menor a la velocidad angular, rotar directamente al objetivo
        if (Math.abs(delta) < velAngular) {
            angulo = anguloObjetivo;
        } else {
            angulo += Math.signum(delta) * velAngular;
        }

        // ajuste de angulo final al rango -180, 180
        if (angulo < -180) {
            angulo += 360f;
        } else if (angulo > 180) {
            angulo -= 360f;
        }
    }
    /**
     * ajusta las posiciones del misil, segun la velocidad y el angulo
     */
    public void mover(){//llamar en repaint
        
            Vector2 frente = new Vector2((float) Math.cos(Math.toRadians(angulo)), (float) Math.sin(Math.toRadians(angulo)));
            frente.escalar(velocidad);
        
            x += frente.x;
            y += frente.y;
        
            if(x > Ventana.WIDTH) x -= Ventana.WIDTH;
            if(x < 0) x += Ventana.WIDTH;
        
            if(y > Ventana.HEIGHT) y -= Ventana.HEIGHT;
            if(y < 0) y += Ventana.HEIGHT;
        
    }
    /**
     * recibe dos parametros para generar numeros aleatorios que se usaran en los angulos
     * @param min
     * @param max
     * @return 
     */
    public static double getRandomIntegerBetweenRange(double min, double max){
    double x = (int)(Math.random()*((max-min)+1))+min;
    return x;
    }

}
