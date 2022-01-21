package layouts;

import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Layouts1 {
    
    public static void main(String[] args) {
        VentanaLay ventana = new VentanaLay();
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}

class VentanaLay extends JFrame{
    
    public VentanaLay(){
        setBounds(400,400,400,400);
        setVisible(true);
        setTitle("Mi Marco");
        MarcoLay marco1 = new MarcoLay();
        FlowLayout disposicion = new FlowLayout(FlowLayout.CENTER,20,20);
        marco1.setLayout(disposicion);
        //marco1.setLayout(new FlowLayout(FlowLayout.LEFT);
        add(marco1);
        
    }
}

class MarcoLay extends JPanel{
    
    public MarcoLay(){
        
        JButton botonazul = new JButton("Boton azul");
        add(botonazul);
        
        add(new JButton("Boton Amarillo"));
        
        add(new JButton("Boton Rojo"));
        
    }
}