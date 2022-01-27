package practicas;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class MarcosDialogos extends JFrame {

    public MarcosDialogos() {

        setBounds(500, 300, 600, 450);

        setTitle("Prueba de Dialogos");

        JPanel laminaCuadricula = new JPanel();

        laminaCuadricula.setLayout(new GridLayout(2, 3));

        String primero[] = {"Mensaje", "Confirmar", "Opcion", "Entrada"};

        laminaTipo = new LaminaBotones("Tipo", primero);

        laminaTipoMensaje = new LaminaBotones("Tipo de Mensaje", new String[]{
            "ERROR_MESSAGE",
            "INFORMATION_MESSAGE",
            "QUESTION_MESSAGE",
            "PLAIN_MESSAGE"

        });

        laminaMensaje = new LaminaBotones("Mensaje", new String[]{
            "Cadena",
            "Icono",
            "Componente",
            "Otros",
            "Object[]"

        });

        laminaTipoOpcion = new LaminaBotones("Confirmar", new String[]{
            "DEFAULT_OPCION",
            "YES_NO_OPTION",
            "YES_NO_CANCEL_OPTION",
            "OK_CANCEL_OPTION"

        });

        laminaOpciones = new LaminaBotones("opcion", new String[]{
            "String[]",
            "Icon[]",
            "Object[]"

        });

        laminaEntrada = new LaminaBotones("Mensaje", new String[]{
            "Campo de texto",
            "Combo"
        });
        
        setLayout(new BorderLayout());
        
        laminaCuadricula.add(laminaTipo);
        laminaCuadricula.add(laminaTipoMensaje);
        laminaCuadricula.add(laminaMensaje);
        laminaCuadricula.add(laminaTipoOpcion);
        laminaCuadricula.add(laminaOpciones);
        laminaCuadricula.add(laminaEntrada);
        
        JPanel laminaMostrar = new JPanel();
        JButton botonMostrar = new JButton("Mostrar");
        botonMostrar.addActionListener(new AccionMostrar());
        
        laminaMostrar.add(botonMostrar);
        add(laminaMostrar, BorderLayout.SOUTH);
        add(laminaCuadricula, BorderLayout.CENTER);

    }
    
    private class AccionMostrar implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            
            //System.out.println(laminaTipo.dameSeleccion());
            if(laminaTipo.dameSeleccion().equals("Mensaje")){
                
                JOptionPane.showMessageDialog(MarcosDialogos.this, "Mensaje","Titulo",0);
           
            }else if(laminaTipo.dameSeleccion().equals("Confirmar")){
                
                JOptionPane.showConfirmDialog(MarcosDialogos.this, "Mensaje","Titulo",0);
           
            }else if(laminaTipo.dameSeleccion().equals("Entrada")){
                
                JOptionPane.showInputDialog(MarcosDialogos.this, "Mensaje","Titulo",0);
          
            }else if(laminaTipo.dameSeleccion().equals("Opcion")){
                
                JOptionPane.showOptionDialog(MarcosDialogos.this, "Mensaje","Titulo",0,0,null, null,null);
            }
        }
    

    
}

    private LaminaBotones laminaTipo, laminaTipoMensaje, laminaMensaje, laminaTipoOpcion, laminaOpciones, laminaEntrada;

}
