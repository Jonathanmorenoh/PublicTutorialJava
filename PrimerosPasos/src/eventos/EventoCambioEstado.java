package eventos;

import java.awt.Frame;
import java.awt.event.*;
import javax.swing.*;

public class EventoCambioEstado {

    public static void main(String[] args) {
        
        cambioEstado ventana = new cambioEstado();
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
}

class cambioEstado extends JFrame {
    
    public cambioEstado() {
        
        setBounds(400, 400, 500, 300);
        setVisible(true);
        cambios cambioventana = new cambios();
        addWindowStateListener(cambioventana);
    }
    
}

class cambios implements WindowStateListener{
    
    public void windowStateChanged(WindowEvent e){
        
        System.out.println("La ventana cambio de estado");
        //System.out.println(e.getNewState());
        
        if(e.getNewState()==Frame.MAXIMIZED_BOTH){
            System.out.println("Ventana maximizada");
        }else if(e.getNewState() == Frame.NORMAL){
            System.out.println("Ventana tamano normal");
        }
    
    }
    
}
