package swing;

import java.awt.BorderLayout;
import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class CreandoCajas {

    public static void main(String[] args) {
        MarcoCaja mimarco = new MarcoCaja();
        mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mimarco.setVisible(true);
    }

}

class MarcoCaja extends JFrame {

    public MarcoCaja() {

        setBounds(400, 300, 400, 300);
        setTitle("Marco con Cajas");
        JLabel rotulo1 = new JLabel("Nombre:");
        JTextField texto1 = new JTextField(10);
        texto1.setMaximumSize(texto1.getPreferredSize());

        Box cajaH1 = Box.createHorizontalBox();
        cajaH1.add(rotulo1);
        cajaH1.add(Box.createHorizontalStrut(10));
        cajaH1.add(texto1);

        JLabel rotulo2 = new JLabel("Contrasena");
        JTextField texto2 = new JTextField(10);
        texto2.setMaximumSize(texto2.getPreferredSize());

        Box cajaH2 = Box.createHorizontalBox();
        cajaH2.add(rotulo2);
        cajaH2.add(Box.createHorizontalStrut(10));
        cajaH2.add(texto2);
        
        JButton boton1 = new JButton("Ok");
        JButton boton2 = new JButton("Cancelar");
        
        Box cajaH3 = Box.createHorizontalBox();
        cajaH3.add(boton1);
        cajaH3.add(Box.createGlue());
        cajaH3.add(boton2);
        
        Box cajaV1 = Box.createVerticalBox();
        cajaV1.add(cajaH1);
        cajaV1.add(cajaH2);
        cajaV1.add(cajaH3);
        
        add(cajaV1, BorderLayout.CENTER);
        

    }
}
