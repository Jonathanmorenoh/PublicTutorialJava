package swing;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

public class CreandoLogin {

    public static void main(String[] args) {
        MarcoLogin ventana = new MarcoLogin();
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

class MarcoLogin extends JFrame {

    public MarcoLogin() {

        setBounds(600, 200, 600, 400);
        setTitle("Login con JAVA");

        LaminaLogin lamina1 = new LaminaLogin();
        add(lamina1);

        setVisible(true);

    }
}

class LaminaLogin extends JPanel {

    public LaminaLogin() {

        setLayout(new BorderLayout());

        JPanel lamina2 = new JPanel();
        lamina2.setLayout(new GridLayout(2, 2));
        add(lamina2, BorderLayout.NORTH);
        JLabel etiqueta1 = new JLabel("Usuario");
        JLabel etiqueta2 = new JLabel("Password");
        JTextField user = new JTextField(15);
        
        pass = new JPasswordField(15);
        CompruebaPass check = new CompruebaPass();
        pass.getDocument().addDocumentListener(check);
        
        lamina2.add(etiqueta1);
        lamina2.add(user);
        lamina2.add(etiqueta2);
        lamina2.add(pass);
        JButton enviar = new JButton();
        add(enviar, BorderLayout.SOUTH);
        

    }
    
    private class CompruebaPass implements DocumentListener{

        @Override
        public void insertUpdate(DocumentEvent e) {
            
           char password[];
           password = pass.getPassword();
           if(password.length<8 || password.length>12){
               pass.setBackground(Color.red);
           }else{
               pass.setBackground(Color.GREEN);
           }
           
        }

        @Override
        public void removeUpdate(DocumentEvent e) {
            
        }

        @Override
        public void changedUpdate(DocumentEvent e) {
            
        }
        
    }
     JPasswordField pass;
}
