package eventos;

import javax.swing.*;

import java.awt.event.*; //TODsOS LOS EVENTOS

public class EventosVentana {

    public static void main(String[] args) {

        marcoVentana nuevoMarco = new marcoVentana();

        nuevoMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}

class marcoVentana extends JFrame {

    public marcoVentana() {

        setBounds(300, 300, 500, 300);
        setTitle("Marco con evento de Ventana");
        setVisible(true);
        M_Ventana oyente_ventana = new M_Ventana();
        addWindowListener(oyente_ventana);

    }
}

//CLASE OYENTE
class M_Ventana implements WindowListener {

    //LUEGO DE IMPLEMENTAR UNA INTERFAZ HAY QUE INSTANCIAR TODOS LOS METODOS
    public void windowActivated(WindowEvent e) {

        System.out.println("Ventana activa");
    }

    public void windowClosed(WindowEvent e) {
    }

    public void windowClosing(WindowEvent e) {

        System.out.println("Ventana cerrandos");
    }

    public void windowDeactivated(WindowEvent e) {
    }

    public void windowDeiconified(WindowEvent e) {
    }

    public void windowOpened(WindowEvent e) {
    }

    public void windowIconified(WindowEvent e) {

        System.out.println("Ventana minimizada");
    }

}
