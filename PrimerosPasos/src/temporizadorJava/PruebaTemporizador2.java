package temporizadorJava;

import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;
import javax.swing.Timer;
import javax.swing.*;

public class PruebaTemporizador2 {

    public static void main(String[] args) {
        
        Reloj mireloj = new Reloj(3000, true);
        mireloj.enMarcha();
        JOptionPane.showMessageDialog(null, "Aceptar para finalizar");
        System.exit(0);
    }
}

class Reloj {

    private int intervalo;
    private boolean sonido;
    
    
    public Reloj(int intervalo, boolean sonido) {
        
        this.intervalo = intervalo;
        this.sonido = sonido;

    }
    
    public void enMarcha(){
        
        ActionListener oyente = new DameLaHora2();
        Timer mitemporizador = new Timer(intervalo, oyente);
        mitemporizador.start();
    }
    
    private class DameLaHora2 implements ActionListener{
    
    public void actionPerformed(ActionEvent evento){
        
        Date ahora = new Date();
            System.out.println("Te pongo la hora cada 3 seg" + ahora);
            if(sonido){
                Toolkit.getDefaultToolkit().beep();
            }
    }
}
}
