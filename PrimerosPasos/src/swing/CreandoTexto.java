package swing;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class CreandoTexto {

    public static void main(String[] args) {

        MarcoTexto mimarco = new MarcoTexto();
        mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mimarco.setVisible(true);

    }

}

class MarcoTexto extends JFrame {

    public MarcoTexto() {

        setBounds(600, 300, 600, 400);
        setTitle("Marco con Texto");
        LaminaTexto lamina1 = new LaminaTexto();
        add(lamina1);
    }
}

class LaminaTexto extends JPanel {

    public LaminaTexto() {
        
        setLayout(new BorderLayout());
        JPanel lamina2 = new JPanel();
        lamina2.setLayout(new FlowLayout());
        resultado = new JLabel("", JLabel.CENTER);
        JLabel texto1 = new JLabel("Email: ");
        lamina2.add(texto1);
        mitexto = new JTextField(40);
        lamina2.add(mitexto);
        add(resultado, BorderLayout.CENTER);
        JButton miboton = new JButton("Comprobar");
        DameTexto mievento = new DameTexto();
        miboton.addActionListener(mievento);
        lamina2.add(miboton);
        add(lamina2, BorderLayout.NORTH);
        

    }

    private class DameTexto implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {

            int correcto = 0;

            String email = mitexto.getText().trim();

            for (int i = 0; i < email.length(); i++) {

                if (email.charAt(i) == '@') {
                    correcto++;
                }
            }
            if(correcto !=1){
                resultado.setText("Incorrecto");
            }else{
                resultado.setText("Correcto");
            }
        }
    }
    private JTextField mitexto;
    public JLabel resultado;
}


/*
USO CONSTRUCTORES ---> NombreConstructor NombreClase = new NombreConstructor(Parametros o vacio);
USO DE METODOS --->     1 - STATIC --> NombreClase.NombreMetodo();    2- NO STATIC --> NombreMetodo();
USO DE CLASE -->    public class void NOMBRECLASE{} 
 */
