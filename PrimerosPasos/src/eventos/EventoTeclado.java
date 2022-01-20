package eventos;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JFrame;

public class EventoTeclado {
    
    public static void main(String[] args) {
        
        VentanaMarco ventana = new VentanaMarco();
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

class VentanaMarco extends JFrame{
    
    public VentanaMarco(){
        
       setBounds(400,300,500,350);
       setVisible(true);
       ActionTeclado tecla = new ActionTeclado();
       addKeyListener(tecla);
    }
}

class ActionTeclado implements KeyListener{

    @Override
    public void keyTyped(KeyEvent e) {
        char caracter = e.getKeyChar();
        System.out.println("caracter = " + caracter);
    }

    @Override
    public void keyPressed(KeyEvent e) {
        int codigo=e.getKeyCode();
        System.out.println("codigo = " + codigo);
    }

    @Override
    public void keyReleased(KeyEvent e) {
        
    }
    
    
    
}