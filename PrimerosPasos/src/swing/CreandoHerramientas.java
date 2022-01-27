package swing;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.KeyStroke;

public class CreandoHerramientas {
    
    public static void main(String[] args) {
        
        MarcoAccion miventana = new MarcoAccion();
        miventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

class MarcoAccion extends JFrame{
    
    public MarcoAccion(){
        
        setVisible(true);
        setBounds(600,350,600,300);
        setTitle("Prueba Acciones");
        PanelAccion lamina = new PanelAccion();
        add(lamina);

    }
}

class PanelAccion extends JPanel{
    
    public PanelAccion(){
        
        verde = new JButton("Verde");
        rojo = new JButton("Rojo");
        azul = new JButton("Azul");
        
        OyenteColor cambioColor = new OyenteColor();
        
        verde.addActionListener(cambioColor);
        azul.addActionListener(cambioColor);
        rojo.addActionListener(cambioColor);
       
        add(verde);
        add(rojo);
        add(azul);

    }
    class OyenteColor implements ActionListener{

    @Override
    public void actionPerformed(ActionEvent e) {
            
        Object botonPulsado = e.getSource();
        
        if(botonPulsado == azul){
            setBackground(Color.BLUE);
        }
        else if(botonPulsado == rojo){
            setBackground(Color.RED);
        }else if(botonPulsado == verde){
            setBackground(Color.GREEN);
        }
        
      }
    } 
    JButton verde;
    JButton azul;
    JButton rojo;

}