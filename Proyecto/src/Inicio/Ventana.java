package Inicio;

import java.awt.BorderLayout;
import javax.swing.JFrame;

public class Ventana extends JFrame{
    
    public static int WIDTH = 1280;
    public static int HEIGHT = 720;
    PanelPrincipal jpanel = new PanelPrincipal();
    /**
     * Contiene todo lo necesario para crear la ventana, con el tamañp definido
     */
    public Ventana() {
        
        setSize(WIDTH, HEIGHT);
        add(jpanel,BorderLayout.CENTER);
        setLayout(new BorderLayout());
        setLocationRelativeTo(jpanel);
        addKeyListener(jpanel);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
}
