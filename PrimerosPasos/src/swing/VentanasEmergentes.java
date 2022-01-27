package swing;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class VentanasEmergentes {

    public static void main(String[] args) {

        MarcoEmergente miventana = new MarcoEmergente();
        miventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        miventana.setVisible(true);
    }

}

class MarcoEmergente extends JFrame {

    public MarcoEmergente() {

        setLayout(new BorderLayout());
        setBounds(400, 300, 500, 350);
        setTitle("Marco con emergentes");
        LaminaEmergente milamina = new LaminaEmergente();
        add(milamina);

    }
}

class LaminaEmergente extends JPanel {

    public LaminaEmergente() {

        boton1 = new JButton("BOTON 1");
        boton2 = new JButton("BOTON 2");
        boton3 = new JButton("BOTON 3");
        boton4 = new JButton("BOTON 4");

        boton1.addActionListener(new EventoEmergente());
        boton2.addActionListener(new EventoEmergente());
        boton3.addActionListener(new EventoEmergente());
        boton4.addActionListener(new EventoEmergente());

        add(boton1);
        add(boton2);
        add(boton3);
        add(boton4);

    }

    private class EventoEmergente implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {

            if (e.getSource() == boton1) {

                JOptionPane.showMessageDialog(LaminaEmergente.this, "Mensaje de Prueba", "advertencia", 2);

            } else if (e.getSource() == boton2) {

                JOptionPane.showInputDialog(LaminaEmergente.this, "Mensaje de prueba 2", "advertencia", 1);

            } else if (e.getSource() == boton3) {

                JOptionPane.showConfirmDialog(LaminaEmergente.this, "Elige opcion", "V Confirmar", 2);
                
            } else if(e.getSource()== boton4){
                   
               JOptionPane.showOptionDialog(LaminaEmergente.this, "Elige", "Nombre ventana", 1 , 1, null, null , null);
            }

        }

    }
    JButton boton1, boton2, boton3, boton4;

}

/*

-CUAROS DE DIALOGO ----> JOptionPane

-SELECCION DE FICHEROS ---> JFileChooser

-SELECCION DE COLOR ---> JColorChooser

 */
