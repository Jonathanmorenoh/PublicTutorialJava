/* package swing;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextPane;

public class ProcesadorTexto {

    public static void main(String[] args) {

        MenuProcesador miVentana = new MenuProcesador();
        miVentana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}

class MenuProcesador extends JFrame {

    public MenuProcesador() {

        setBounds(500, 300, 550, 400);
        setTitle("Word JAVA");
        LaminaProcesador lamina1 = new LaminaProcesador();
        add(lamina1);
        setVisible(true);

    }
}

class LaminaProcesador extends JPanel {

    public LaminaProcesador() {

        setLayout(new BorderLayout());

        JPanel laminaMenu = new JPanel();

        JMenuBar miBarra = new JMenuBar();

        //---------------------------------------------------
        
        JMenu fuente = new JMenu("Fuente");
        JMenu estilo = new JMenu("Estilo");
        JMenu tamano = new JMenu("Tamano");

        //----------------------------------------------------
        
        JMenuItem arial = new JMenuItem("Arial");
        
        arial.addActionListener(new ActionListener(){
        
            public void actionPerformed(ActionEvent e) {
            
           //AQUI SE COLOCA QUE ES LO QUE SE TIENE QUE HACER
            
           miarea.setFont(new Font("Arial", Font.PLAIN, 12));
           
            }

        });
        
        JMenuItem courier = new JMenuItem("Courier");
        
        courier.addActionListener(new ActionListener(){
        
            public void actionPerformed(ActionEvent e) {
            
           //AQUI SE COLOCA QUE ES LO QUE SE TIENE QUE HACER
            
           miarea.setFont(new Font("Courier", Font.PLAIN, 12));
           
            }

        });
        
        //1--->ES IGUAL --->GestionMenu tipoLetra = new GestionMenu();
        //courier.addActionListener(tipoLetra);
        
        //2---> ES IGUAL --> courier.addActionListener(new GestionMenu)
        
        JMenuItem verdana = new JMenuItem("Verdana");
        
        verdana.addActionListener(new ActionListener(){
        
            public void actionPerformed(ActionEvent e) {
            
           //AQUI SE COLOCA QUE ES LO QUE SE TIENE QUE HACER
            
           miarea.setFont(new Font("Verdana", Font.PLAIN, 12));
           
            }

        });

        fuente.add(arial);
        fuente.add(courier);
        fuente.add(verdana);

        //---------------------------------------------------------
        
        JMenuItem negrita = new JMenuItem("Negrita");
        JMenuItem cursiva = new JMenuItem("Cursiva");

        estilo.add(negrita);
        estilo.add(cursiva);

        //-----------------------------------------------------------
        
        JMenuItem tam12 = new JMenuItem("12");
        JMenuItem tam16 = new JMenuItem("16");
        JMenuItem tam20 = new JMenuItem("20");

        tamano.add(tam12);
        tamano.add(tam16);
        tamano.add(tam20);

        //-----------------------------------------------------------------
        
        miBarra.add(fuente);
        miBarra.add(estilo);
        miBarra.add(tamano);

        laminaMenu.add(miBarra);
        add(laminaMenu, BorderLayout.NORTH);
        
        miarea = new JTextPane();
        add(miarea, BorderLayout.CENTER);
        
    }
    
   /*private class GestionMenu implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            
           //AQUI SE COLOCA QUE ES LO QUE SE TIENE QUE HACER
            
           miarea.setFont(new Font("Courier", Font.PLAIN, 12));
            
        }

    }
    JTextPane miarea;
    
}
*/