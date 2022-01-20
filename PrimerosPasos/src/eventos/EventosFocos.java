package eventos;

import java.awt.Graphics;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowFocusListener;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class EventosFocos {

    public static void main(String[] args) {
        marcoEvento mimarco = new marcoEvento();
        mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

class marcoEvento extends JFrame {

    public marcoEvento() {

        setBounds(400, 300, 500, 350);
        setTitle("Eventos foto");
        setVisible(true);
        add(new laminaEvento());
    }
}

class laminaEvento extends JPanel {

    public void paintComponent(Graphics g) {

        super.paintComponent(g);

        setLayout(null);

        cuadro1 = new JTextField();
        cuadro2 = new JTextField();
        cuadro1.setBounds(120, 10, 150, 20);
        cuadro2.setBounds(120, 50, 150, 20);
        add(cuadro1);
        add(cuadro2);
        focoEvento foco1 = new focoEvento();
        cuadro1.addFocusListener(foco1);

    }

    private class focoEvento implements FocusListener {

        @Override
        public void focusGained(FocusEvent e) {
             System.out.println("Has ganado el foco");
        }

        @Override
        public void focusLost(FocusEvent e) {
            //System.out.println("Has perdido el foco");
            
            String email = cuadro1.getText();
            
            boolean comprobacion = false;
            
            for( int i=0; i<email.length();i++){
                if(email.charAt(i)=='@'){
                    comprobacion=true;
                }
            }
            if(comprobacion == true){
                System.out.println("El mail es correcto");
            }
            else{
                System.out.println("Mail Incorrecto");
            }
            
        }

    }

    JTextField cuadro1;
    
    JTextField cuadro2;

}
