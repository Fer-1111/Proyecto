package Inicio;
import javax.swing.JFrame;

public class Ventana extends JFrame{
    
    PanelPrincipal jpanel = new PanelPrincipal();
    
    public Ventana() {
        setSize(1280, 720);
        add(jpanel);
        addKeyListener(jpanel);
        setLocationRelativeTo(jpanel);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
}
