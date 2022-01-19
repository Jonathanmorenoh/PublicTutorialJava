package swing;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.*;

import java.awt.geom.*;

public class CreandoMarcosColores{
    
    public static void main(String[] args) {
        
        MarcosConColores mimarco = new MarcosConColores();
        
        mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        mimarco.setVisible(true);
    }
}

class MarcosConColores extends JFrame{
    
    public MarcosConColores(){
        
        setTitle("Prueba con colores");
        setSize(400,400);
        LaminaConColor milamina = new LaminaConColor();
        add(milamina);
        milamina.setBackground(Color.red);
    }
    
}

class LaminaConColor extends JPanel{
    
    public void paintComponent(Graphics g){
        
        super.paintComponent(g);
        
        Graphics2D g2=(Graphics2D) g;
        
        Font mifuente = new Font("Arial", Font.BOLD, 26);
        
        Rectangle2D rectangulo = new Rectangle2D.Double(100,100,200,150);
        
        g2.setPaint(Color.BLACK);
        
        g2.fill(rectangulo);
        
        Ellipse2D elipse = new Ellipse2D.Double();
        
        elipse.setFrame(rectangulo);
        
        g2.setPaint(new Color(0,140,255).brighter().brighter().brighter());
        
        g2.fill(elipse);
        
        g2.setFont(mifuente);
        
        g2.drawString("Juan", 100,100);
        
        
        

    }
    
}