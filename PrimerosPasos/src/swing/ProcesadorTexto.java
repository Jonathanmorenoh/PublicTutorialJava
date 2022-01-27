package swing;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextPane;
import javax.swing.KeyStroke;

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

        //----------------------------------------------------------------------
        fuente = new JMenu("Fuente");
        estilo = new JMenu("Estilo");
        tamano = new JMenu("Tamano");

        configura_menu("Arial", "fuente", "Arial", 9, 10);
        configura_menu("Courier", "fuente", "Courier", 9, 10);
        configura_menu("Verdana", "fuente", "Verdana", 9, 10);

        //----------------------------------------------------------------------
        configura_menu("Negrita", "estilo", "", Font.BOLD, 12 );
        configura_menu("Cursiva", "estilo", "", Font.ITALIC, 12);

        //----------------------------------------------------------------------
        configura_menu("12", "tamano", "", 9, 12);
        configura_menu("16", "tamano", "", 9, 16);
        configura_menu("20", "tamano", "", 9, 20);

        //----------------------------------------------------------------------
        miBarra.add(fuente);
        miBarra.add(estilo);
        miBarra.add(tamano);

        laminaMenu.add(miBarra);
        add(laminaMenu, BorderLayout.NORTH);

        miarea = new JTextPane();
        add(miarea, BorderLayout.CENTER);

    }

    //--------------------------------------------------------------------------
    //LOS METODOS SE ESCRIBEN ASI
    public void configura_menu(String rotulo, String menu, String tipoLetra, int estilos, int tam) {

        JMenuItem elem_menu = new JMenuItem(rotulo);
        if (menu == "fuente") {
            fuente.add(elem_menu);
        } else if (menu == "estilo") {
            estilo.add(elem_menu);
        } else if (menu == "tamano") {
            tamano.add(elem_menu);
        }
        elem_menu.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N, InputEvent.CTRL_DOWN_MASK));
        elem_menu.addActionListener(new GestionEvento(rotulo, tipoLetra, estilos, tam));
    }

    private class GestionEvento implements ActionListener {

        String tipo_texto, menu;
        int estilo_letra, tamano_letra;

        GestionEvento(String elemento, String texto2, int estilo2, int tam_letra) {

            tipo_texto = texto2;
            estilo_letra = estilo2;
            tamano_letra = tam_letra;
            menu = elemento;

        }

        @Override
        public void actionPerformed(ActionEvent e) {
     
            letras = miarea.getFont();
            if(menu=="Arial" || menu == "Courier" ||menu=="Verdana"){
                estilo_letra = letras.getStyle();
                
                tamano_letra = letras.getSize();
 
            }else if(menu == "Cursiva" || menu == "Negrita"){
                
                tipo_texto = letras.getFontName();
                
                tamano_letra=letras.getSize();
            }else if(menu == "12" || menu == "16" || menu == "20"){
                
                estilo_letra = letras.getStyle();
                tipo_texto = letras.getFontName();
            }
            
            miarea.setFont(new Font(tipo_texto, estilo_letra, tamano_letra));
        }

    }

    JTextPane miarea;

    JMenu fuente, estilo, tamano;

    Font letras;

}


/*      ************ USO API ******************

1- SE INSTANCIA LA CLASE CON UN CONSTRUCTOR

    JToolBar mibarra = new JToolBar(ARGUMENTOS DEL CONSTRUCTOR);

2- 






*/