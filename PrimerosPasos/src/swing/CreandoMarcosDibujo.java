package swing;

import java.awt.*;
import javax.swing.*;


public class CreandoMarcosDibujo {
    
    public static void main(String[] args) {
        
        MarcosConDibujo mimarco = new MarcosConDibujo();
        
        mimarco.setVisible(true);
        
        mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
}


class MarcosConDibujo extends JFrame{
    
    public MarcosConDibujo(){
        
        setTitle("Marco con dibijo");
        setLocation(400,300);
        setSize(400,300);
        LaminaConDibujo lamina1 = new LaminaConDibujo();
        add(lamina1);
        
        
    }
}

class LaminaConDibujo extends JPanel{
    
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        g.drawRect(50, 50, 200, 200);
    }
}
