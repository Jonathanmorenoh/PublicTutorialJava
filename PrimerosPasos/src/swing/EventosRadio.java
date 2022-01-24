package swing;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class EventosRadio {

    public static void main(String[] args) {

        MarcoRadio mimarco = new MarcoRadio();
        mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mimarco.setVisible(true);

    }
}

class MarcoRadio extends JFrame {

    public MarcoRadio() {

        setBounds(600, 400, 400, 350);
        setTitle("Eventos de Radio");
        LaminaRadio lamina1 = new LaminaRadio();
        add(lamina1);
    }
}

class LaminaRadio extends JPanel {

    public LaminaRadio() {

        setLayout(new BorderLayout());

        texto = new JLabel("En un lugar de la mancha de cuyo nombre..");

        add(texto, BorderLayout.CENTER);

        ButtonGroup migrupo = new ButtonGroup();

        boton1 = new JRadioButton("Pequeno", false);
        boton2 = new JRadioButton("Mediano", true);
        boton3 = new JRadioButton("Grande", false);
        boton4 = new JRadioButton("Muy Grande", false);

        JPanel lamina_radio = new JPanel();
        eventoRadio mievento = new eventoRadio();
        boton1.addActionListener(mievento);
        boton2.addActionListener(mievento);
        boton3.addActionListener(mievento);
        boton4.addActionListener(mievento);
        
        migrupo.add(boton1);
        migrupo.add(boton2);
        migrupo.add(boton3);
        migrupo.add(boton4);
        
        lamina_radio.add(boton1);
        lamina_radio.add(boton2);
        lamina_radio.add(boton3);
        lamina_radio.add(boton4);
        
        add(lamina_radio, BorderLayout.SOUTH);

    }
    private class eventoRadio implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            
            if(e.getSource()==boton1){
               texto.setFont(new Font("Serif", Font.PLAIN, 10));
            }else if(e.getSource()==boton2){
                texto.setFont(new Font("Serif", Font.PLAIN, 18));
            }else if(e.getSource()==boton3){
                texto.setFont(new Font("Serif", Font.PLAIN, 24));
            }else if(e.getSource()==boton4){
                texto.setFont(new Font("Serif", Font.PLAIN, 32));
            }
        }
        
    }
    private JLabel texto;
    private JRadioButton boton1, boton2, boton3, boton4;
}
