package swing;

import java.awt.*;
import java.awt.geom.*;
import javax.swing.*;


public class CreandoMarcos2D {
    
    public static void main(String[] args) {
        
        MarcosConDibujo mimarco = new MarcosConDibujo();
        
        mimarco.setVisible(true);
        
        mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
}


class MarcosConDibujo2D extends JFrame{
    
    public MarcosConDibujo2D(){
        
        setTitle("Marco con dibijo");
        setLocation(400,300);
        setSize(400,300);
        LaminaConDibujo lamina1 = new LaminaConDibujo();
        add(lamina1);
        
        
    }
}

class LaminaConDibujo2D extends JPanel{
    
    public void paintComponent(Graphics g){
        
        super.paintComponent(g);
        
        Graphics2D g2 = (Graphics2D) g;
        
        Rectangle2D rectangulo = new Rectangle2D.Double(100,100,200,150);
        
        g2.draw(rectangulo);
        
        Ellipse2D elipse = new Ellipse2D.Double();
        
        elipse.setFrame(rectangulo);
        
        g2.draw(elipse);
        
        g2.draw(new Line2D.Double(100,100,300,250));

    }
}