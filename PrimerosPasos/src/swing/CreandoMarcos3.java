package swing;

import java.awt.*;
import javax.swing.*;

public class CreandoMarcos3 {
    
    public static void main(String[] args) {
        
        MarcoConTexto mimarco = new MarcoConTexto();
        mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}

class MarcoConTexto extends JFrame {
    
    public MarcoConTexto() {
        
        Toolkit mipantalla = Toolkit.getDefaultToolkit();
        setVisible(true);
        setSize(600, 400);
        setLocation(600, 400);
        setTitle("Frame with Text");
        Image miIcono = mipantalla.getImage("src/swing/robot.png");
        setIconImage(miIcono);
        Lamina lamina1 = new Lamina();
        add(lamina1);
        
    }
}

class Lamina extends JPanel {
    
    public void paintComponent(Graphics g) {
        
        super.paintComponent(g);
        
        g.drawString("Estamos aprendiendo swing", 100, 100);
    }
    
}
