package eventos;

import java.awt.Color;
import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class EventosMultiples {

    public static void main(String[] args) {
        marcoAcciones mimarco = new marcoAcciones();
        mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}

class marcoAcciones extends JFrame {

    public marcoAcciones() {

        setVisible(true);
        setBounds(300, 350, 600, 400);
        setTitle("Eventos Multiples");
        PanelAcciones lamina1 = new PanelAcciones();
        add(lamina1);
    }

}

class PanelAcciones extends JPanel {

    public PanelAcciones() {

        eventosVentana accionVerde = new eventosVentana("Verde", new ImageIcon("src/eventos/bolverde.png"), Color.GREEN);
        eventosVentana accionAzul = new eventosVentana("Azul", new ImageIcon("src/eventos/bolazul.png"), Color.BLUE);
        eventosVentana accionRojo = new eventosVentana("Roja", new ImageIcon("src/eventos/bolroja.png"), Color.RED);

        add(new JButton(accionVerde));
        add(new JButton(accionAzul));
        add(new JButton(accionRojo));

        /*JButton botonVerde = new JButton(colorVerde);
    add(botonVerde);*/
 /*JButton botonAzul = new JButton("Azul");
    JButton botonRojo = new JButton("Rojo");
    JButton botonVerde = new JButton("Verde");

    public laminaAcciones() {

        add(botonAzul);
        add(botonRojo);
        add(botonVerde);
    }*/
    }

    private class eventosVentana extends AbstractAction {

        public eventosVentana(String nombre, Icon icono, Color color_boton) {

            putValue(Action.NAME, nombre);
            putValue(Action.SMALL_ICON, icono);
            putValue(Action.SHORT_DESCRIPTION, "Poner la lamina de color" + nombre);
            putValue("color_de_fondo", color_boton);
        }

        @Override
        public void actionPerformed(ActionEvent e) {

            Color c = (Color) getValue("color_de_fondo");
            setBackground(c);
            System.out.println("Nombre: " +getValue(Action.NAME));
        }

    }
}
