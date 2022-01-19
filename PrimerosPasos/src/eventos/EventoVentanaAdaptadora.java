
package eventos;

import java.awt.event.*;
import javax.swing.*;


public class EventoVentanaAdaptadora {

    public static void main(String[] args) {
        
        ventanaAdaptadora miventana = new ventanaAdaptadora();
        miventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
            
}

class ventanaAdaptadora extends JFrame{
    
    public ventanaAdaptadora(){
        
        setBounds(400,400,500,300);
        setTitle("Ventana con adapatadores");
        setVisible(true);
        adaptacion oyente = new adaptacion();
        addWindowListener(oyente);
    }
}

//****** OJO *****
//Cuando usamos una CLASE de la API
//1- creamos nuestra nueva class ---> public NuevaClase
//2- usamos la palabra reservada extends para heredar todos sus metodos ---> public NuevaClase extends WindowAdapter{}
//3- si es static debemos invocarla usando nombredelaclaseheredadora.metodoquequeramosusar(parametodos){}
//4- si no es static solo usamos el metodo

class adaptacion extends WindowAdapter{
    
    public void windowIconified(WindowEvent e){
        
        System.out.println("Ventana minimizada");
    } 
    
}


//***** OJO ********
//Cuando  usamos una INTERFAZ de la API
//1- creamos nuestra nueva class ---> public NuevaClase
//2- usamos la palabra reservada implements para heredar todos sus metodos ---> public NuevaClase implements WindowListener{}
//3- instanciamos TODOS los metodos que tiene la interfaz
// public void windowClosed(WindowEvent e) {}
    