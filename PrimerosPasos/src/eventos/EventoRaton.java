package eventos;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import javax.swing.JFrame;

public class EventoRaton {
    
    public static void main(String[] args) {
        Ventana miventana = new Ventana();
        miventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

class Ventana extends JFrame{
    
    public Ventana(){
        setBounds(400,400,500,350);
        setTitle("Marco con evento Raton"); 
        setVisible(true);
        mouse mouseaction = new mouse();
        move  mousemove = new move();
        addMouseListener(mouseaction);
        addMouseMotionListener(mousemove);
       
    }
}

class mouse implements MouseListener{

    @Override
    public void mouseClicked(MouseEvent e) {
        System.out.println("Mouse CLickeado");
        System.out.println("Coordena X: = " + e.getX() + "Coordena y: = " + e.getY());
        int cuentas = e.getClickCount();
        System.out.println("cuentas click = " + cuentas);
    }

    @Override
    public void mousePressed(MouseEvent e) {
        System.out.println("Mouse Presionado");
        
        if(e.getModifiersEx()==MouseEvent.BUTTON1_DOWN_MASK){
            System.out.println("Pulsaste el Boton izquierdo");
        }
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        
    }

    @Override
    public void mouseEntered(MouseEvent e) {
       
    }

    @Override
    public void mouseExited(MouseEvent e) {
        
    }
    
}

class move implements MouseMotionListener{

    @Override
    public void mouseDragged(MouseEvent e) {
        
    }

    @Override
    public void mouseMoved(MouseEvent e) {
        System.out.println("Moviste el raton");
    }
    
}