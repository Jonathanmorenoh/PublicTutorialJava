package swing;

import java.awt.*;
import javax.swing.JFrame;

public class CreandoMarcos2 {

    public static void main(String[] args) {
        
        marcoCentrado newframe = new marcoCentrado();
        
        newframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        newframe.setVisible(true);

    }
}

class marcoCentrado extends JFrame {

    public marcoCentrado() {

        Toolkit mipantalla = Toolkit.getDefaultToolkit();
        
        Dimension tamanoPantalla = mipantalla.getScreenSize();

        int alturaPantalla = tamanoPantalla.height;
        int anchoPantalla = tamanoPantalla.width;
        
        setSize(anchoPantalla/2, alturaPantalla/2);
        setLocation(anchoPantalla/4, alturaPantalla/4);
        setTitle("New Frame Windows");
        Image miIcono = mipantalla.getImage("src/swing/robot.png");
        setIconImage(miIcono);
    }
    
}
