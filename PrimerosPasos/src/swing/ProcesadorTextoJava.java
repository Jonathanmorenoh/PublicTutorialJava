package swing;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.JTextPane;
import javax.swing.JToolBar;
import javax.swing.KeyStroke;
import javax.swing.text.StyledEditorKit;

public class ProcesadorTextoJava {

    public static void main(String[] args) {

        MenuProcesador mimarco = new MenuProcesador();

        mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

class MenuProcesador2 extends JFrame {

    public MenuProcesador2() {
        
        setVisible(true);
        setBounds(500, 300, 550, 420);
        LaminaProcesador2 milamina = new LaminaProcesador2();
        add(milamina);
        

    }
}

class LaminaProcesador2 extends JPanel {

    public LaminaProcesador2() {

        setLayout(new BorderLayout());
        JPanel laminamenu = new JPanel();
        JMenuBar mibarra = new JMenuBar();

//------------------------------------------------------------------------------
        fuente = new JMenu("Fuente");
        estilo = new JMenu("Estilo");
        tamano = new JMenu("Tamano");

        configura_menu("Arial", "fuente", "Arial", 9, 10, "");
        configura_menu("Courier", "fuente", "Courier", 9, 10, "");
        configura_menu("Verdana", "fuente", "Verdana", 9, 10, "");

//------------------------------------------------------------------------------
        configura_menu("Negrita", "estilo", "", Font.BOLD, 1, "bin/swing/negrita.gif");
        configura_menu("Cursiva", "estilo", "", Font.ITALIC, 1, "bin/swing/cursiva.gif");

        ButtonGroup tamano_letra = new ButtonGroup();
        JRadioButtonMenuItem doce = new JRadioButtonMenuItem("12");
        JRadioButtonMenuItem dieciseis = new JRadioButtonMenuItem("16");
        JRadioButtonMenuItem veinte = new JRadioButtonMenuItem("20");
        JRadioButtonMenuItem veinticuatro = new JRadioButtonMenuItem("24");

        tamano_letra.add(doce);
        tamano_letra.add(dieciseis);
        tamano_letra.add(veinte);
        tamano_letra.add(veinticuatro);

        doce.addActionListener(new StyledEditorKit.FontSizeAction("cambia_tamano", 12));
        dieciseis.addActionListener(new StyledEditorKit.FontSizeAction("cambia_tamano", 16));
        veinte.addActionListener(new StyledEditorKit.FontSizeAction("cambia_tamano", 20));
        veinticuatro.addActionListener(new StyledEditorKit.FontSizeAction("cambia_tamano", 24));

        tamano.add(doce);
        tamano.add(dieciseis);
        tamano.add(veinte);
        tamano.add(veinticuatro);

        //----------------------------------------------------------------------
        mibarra.add(fuente);
        mibarra.add(estilo);
        mibarra.add(tamano);

        laminamenu.add(mibarra);
        add(laminamenu, BorderLayout.NORTH);

        miarea = new JTextPane();
        add(miarea, BorderLayout.CENTER);
        JPopupMenu emergente = new JPopupMenu();
        JMenuItem negritaE = new JMenuItem("Negrita");
        JMenuItem cursivaE = new JMenuItem("Cursiva");

        negritaE.addActionListener(new StyledEditorKit.BoldAction());
        cursivaE.addActionListener(new StyledEditorKit.ItalicAction());
        emergente.add(negritaE);
        emergente.add(cursivaE);

        miarea.setComponentPopupMenu(emergente);

        //-----------------------------------------------------------------
        barra = new JToolBar();
        configura_barra("src/swing/negrita.gif").addActionListener(new StyledEditorKit.BoldAction());
        configura_barra("src/swing/cursiva.gif").addActionListener(new StyledEditorKit.ItalicAction());
        configura_barra("src/swing/subrayado.gif").addActionListener(new StyledEditorKit.UnderlineAction());
        barra.addSeparator();
        configura_barra("src/swing/bolaazul.gif").addActionListener(new StyledEditorKit.ForegroundAction("Pone_azul", Color.BLUE));
        configura_barra("src/swing/bolaroja.gif").addActionListener(new StyledEditorKit.ForegroundAction("Pone_rojo", Color.RED));
        configura_barra("src/swing/bolaamarilla.gif").addActionListener(new StyledEditorKit.ForegroundAction("Pone_amarillo", Color.YELLOW));
        barra.addSeparator();

        barra = new JToolBar();
        configura_barra("src/swing/negrita.gif").addActionListener(new StyledEditorKit.BoldAction());
        configura_barra("src/swing/subrayado.gif").addActionListener(new StyledEditorKit.UnderlineAction());
        configura_barra("src/swing/cursiva.gif").addActionListener(new StyledEditorKit.ItalicAction());
        
        barra.addSeparator();
        
        configura_barra("src/swing/bolaazul.gif").addActionListener(new StyledEditorKit.ForegroundAction("Pone_azul", Color.BLUE));
        configura_barra("src/swing/bolaroja.gif").addActionListener(new StyledEditorKit.ForegroundAction("Pone_rojo", Color.RED));
        configura_barra("src/swing/bolaamarilla.gif").addActionListener(new StyledEditorKit.ForegroundAction("Pone_amarillo", Color.YELLOW));
        
        barra.setOrientation(1);
        add(barra, BorderLayout.WEST);
    }
    
    public JButton configura_barra(String ruta){
        
        JButton boton = new JButton(new ImageIcon(ruta));
        barra.add(boton);
        return boton;
    }
    

    public void configura_menu(String rotulo, String menu, String tipo_letra, int estilos, int tam, String ruta_icono) {
        JMenuItem elem_menu = new JMenuItem(rotulo, new ImageIcon(ruta_icono));

        if (menu == "fuente") {
            fuente.add(elem_menu);

            if (tipo_letra == "Arial") {
                elem_menu.addActionListener(new StyledEditorKit.FontFamilyAction("cambia_letra", "Arial"));
            } else if (tipo_letra == "Courier") {
                elem_menu.addActionListener(new StyledEditorKit.FontFamilyAction("cambia_letra", "Courier"));
            } else if (tipo_letra == "Verdana") {
                elem_menu.addActionListener(new StyledEditorKit.FontFamilyAction("cambia_letra", "Verdana"));
            }
        } else if (menu == "estilo") {
            estilo.add(elem_menu);
            if (estilos == Font.BOLD) {
                elem_menu.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N, InputEvent.CTRL_DOWN_MASK));
                elem_menu.addActionListener(new StyledEditorKit.BoldAction());
            } else if (estilos == Font.ITALIC) {
                elem_menu.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_K, InputEvent.CTRL_DOWN_MASK));
                elem_menu.addActionListener(new StyledEditorKit.ItalicAction());
            }
        } else if (menu == "tamano") {
            tamano.add(elem_menu);
            elem_menu.addActionListener(new StyledEditorKit.FontSizeAction("cambia_tamano", tam));
        }
    }
    JTextPane miarea;
    JMenu fuente, estilo, tamano;
    Font letras;
    
    JButton negritaBarra, cursivaBarra, subraBarra, azulBarra, rojoBarra, amarilloBarra, a_izquierda, a_centrado, a_derecha, a_justificado;
    JToolBar barra;

}
