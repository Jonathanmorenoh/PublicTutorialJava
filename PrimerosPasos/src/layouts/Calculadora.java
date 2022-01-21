package layouts;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Calculadora {
    
    public static void main(String[] args) {
        
        MarcoCalculadora mimarco = new MarcoCalculadora();
        mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mimarco.setVisible(true);
        
    }
    
}

class MarcoCalculadora extends JFrame {
    
    public MarcoCalculadora() {
        
        setBounds(500, 300, 450, 300);
        setTitle("Calculadora");
        laminaCalculadora milamina = new laminaCalculadora();
        add(milamina);
        

    }
}
class laminaCalculadora extends JPanel{
    
    public laminaCalculadora(){
        
        setLayout(new BorderLayout());
        JButton pantalla = new JButton("0");
        pantalla.setEnabled(false);
        add(pantalla, BorderLayout.NORTH);
        
        
        milamina2 = new JPanel();
        milamina2.setLayout(new GridLayout(4,4));
        ponerBoton("");
        ponerBoton("");
        ponerBoton("");
        ponerBoton("");
        ponerBoton("");
        ponerBoton("");
        ponerBoton("");
        ponerBoton("");
        ponerBoton("");
        ponerBoton("");
        ponerBoton("");
        
        add(milamina2, BorderLayout.CENTER);
    }
    private void ponerBoton(String rotulo){
        JButton boton = new JButton(rotulo);
        milamina2.add(boton);
        
    }
    private JPanel milamina2;
}
