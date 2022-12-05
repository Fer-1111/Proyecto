package Inicio;
import java.awt.BorderLayout;
import javax.swing.JFrame;

public class Ventana extends JFrame{
    
    public static int WIDTH = 1280;
    public static int HEIGHT = 720;
    
    PanelPrincipal jpanel = new PanelPrincipal();
    
    public Ventana() {
        setSize(1280, 720);
        setLayout(new BorderLayout());
        add(jpanel,BorderLayout.CENTER);
        add(jpanel);
        addKeyListener(jpanel);
        setLocationRelativeTo(jpanel);
        addMouseListener(jpanel);
        addMouseMotionListener(jpanel);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
}
