package primerospasos;

import java.awt.Color;
import java.awt.event.*;
import javax.swing.*;

public class Eventos {

    public static void main(String[] args) {

        MarcoBotones mimarco = new MarcoBotones();

        mimarco.setVisible(true);

        mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

}

class MarcoBotones extends JFrame {

    public MarcoBotones() {

        setTitle("Botones y Eventos");
        setBounds(700, 300, 500, 300);

        LaminaBotones milamina = new LaminaBotones();
        add(milamina);
    }
}

class LaminaBotones extends JPanel implements ActionListener {

    JButton botonAzul = new JButton("Azul");
    JButton botonRojo = new JButton("Rojo");

    public LaminaBotones() {

        add(botonAzul);
        add(botonRojo);

//     OBJETO FUENTE      EVENTO SIGNIFICA AL HACER CLIC
        
    botonAzul.addActionListener(this);
    botonRojo.addActionListener(this);
    
    }

    public void actionPerformed(ActionEvent e) {

        Object botonPulsado = e.getSource();
        
        if(botonPulsado == botonAzul){
            setBackground(Color.BLUE);
        }
        else if(botonPulsado == botonRojo){
            setBackground(Color.RED);
        }

    }

}

/*                   EVENTOS == DESENCADENANTES DE ACCION

1- Que desencadena la accion? ----> Objeto evento

        Clase EventObject -> WindowEvent
                          -> ActionEvent

2-Quien desencadena la accion? ---> Objeto Fuente

        Clase JButton -> addActionListener (Objeto Listener)

3-Quien recibe la accion? ---->     Objeto Listener

       Clase JPanel -> ActionListener ->actionPerformed( Objeto event)

 */
