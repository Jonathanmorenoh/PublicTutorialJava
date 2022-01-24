package swing;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class EventosCombo {
    
    public static void main(String[] args) {
        
        ventanaCombo miventana = new ventanaCombo();
        miventana.setVisible(true);
        miventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
    
}

class ventanaCombo extends JFrame{
    public ventanaCombo(){
        
        setBounds(550,300,550,400);
        setTitle("Marco ComboBox");
        laminaCombo lamina1 = new laminaCombo();
        add(lamina1);
        
    }
}

class laminaCombo extends JPanel{
    
    public laminaCombo(){
        
        setLayout(new BorderLayout());
        texto = new JLabel("En un lugar de la Mancha cuyo nombre...");
        texto.setFont(new Font("Serif", Font.PLAIN, 18));
        add(texto, BorderLayout.CENTER);
        JPanel laminaNorte = new JPanel();
        micombo = new JComboBox();
        micombo.setEditable(true);
        micombo.addItem("Serif");
        micombo.addItem("SansSerif");
        micombo.addItem("Monospaced");
        micombo.addItem("Dialog");
        eventoCombo mievento = new eventoCombo();
        micombo.addActionListener(mievento);
        laminaNorte.add(micombo);
        add(laminaNorte, BorderLayout.NORTH);
 
    }
    
    private class eventoCombo implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            texto.setFont(new Font((String)micombo.getSelectedItem(), Font.PLAIN, 14));
        }
        
        
    }
    private JComboBox micombo;
    private JLabel texto;
}