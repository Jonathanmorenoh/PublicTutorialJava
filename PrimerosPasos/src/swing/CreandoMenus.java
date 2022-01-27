package swing;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;

public class CreandoMenus {
    
    public static void main(String[] args) {
        
        ventanaMenu miventana = new ventanaMenu();
        miventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
         
    }
    
}

class ventanaMenu extends JFrame{
    
    public ventanaMenu(){
    setBounds(600,400,600,400);
    setTitle("Menus");
    
    laminaMenu lamina1 = new laminaMenu();
    add(lamina1); 
    
    setVisible(true);
    
    }
    
}

class laminaMenu extends JPanel{
    
    public laminaMenu(){
        
        JPopupMenu emergente = new JPopupMenu();
        JMenuItem opciones1 = new JMenuItem("Opcion 1");
        JMenuItem opciones2 = new JMenuItem("Opcion 2");
        JMenuItem opciones3 = new JMenuItem("Opcion 3");
        
        emergente.add(opciones1);
        emergente.add(opciones2);
        emergente.add(opciones3);
        
        setComponentPopupMenu(emergente);
        
        
        JMenuBar mibarra = new JMenuBar();
        JMenu archivo = new JMenu("Archivo");
        JMenu edicion = new JMenu("edicion");
        JMenu herramientas = new JMenu("herramientas");
        JMenu opcion = new JMenu("Opciones");
        
        JMenuItem guardar = new JMenuItem("Guardar");
        JMenuItem guardarComo = new JMenuItem("Guardar como");
        
        JMenuItem cortar = new JMenuItem("Cortar");
        JMenuItem pegar = new JMenuItem("Pegar");
        
        JMenuItem generales = new JMenuItem("Generales");
        
        JMenuItem opcion1 = new JMenuItem("Opcion 1");
        JMenuItem opcion2 = new JMenuItem("Opcion 2");
        
        opcion.add(opcion1);
        opcion.add(opcion2);
        
        
        herramientas.add(generales);
        edicion.add(pegar);
        edicion.add(cortar);
        edicion.add(opcion);
        archivo.add(guardar);
        archivo.add(guardarComo);
        
        mibarra.add(archivo);
        mibarra.add(edicion);
        mibarra.add(herramientas);
        add(mibarra);
    }
}