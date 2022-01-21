package eventos;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class EventoOyentes {

    public static void main(String[] args) {

        Marco_Principal mimarco = new Marco_Principal();

        mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mimarco.setVisible(true);

    }
}

class Marco_Principal extends JFrame {

    public Marco_Principal() {

        setTitle("Prueba Varios");
        setBounds(1100, 100, 300, 200);

        Lamina_Principal lamina = new Lamina_Principal();
        add(lamina);

    }
}

class Lamina_Principal extends JPanel {

    public Lamina_Principal() {

        JButton boton_nuevo = new JButton("Nuevo");
        add(boton_nuevo);
        boton_cerrar = new JButton("Cerrar todo");
        add(boton_cerrar);
        Oyente miOyente = new Oyente();
        boton_nuevo.addActionListener(miOyente);
        
        
    }
    
    private class Oyente implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
           Marco_Emergente marco = new Marco_Emergente(boton_cerrar);
           marco.setVisible(true);
        }
 
    }
    JButton boton_cerrar;
}

class Marco_Emergente extends JFrame{
    
    public Marco_Emergente(JButton botonDePrincipal){
        
        contador++;
        
        setTitle("Ventana: " + contador);
        setBounds(40*contador, 40*contador, 300,150);
         cierraTodo oyenteCierra = new cierraTodo();
         botonDePrincipal.addActionListener(oyenteCierra);
         
        
    }
    
    private class cierraTodo implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            
            dispose();
        }
        
        
    }
    private static int contador=0;
    
    
}
