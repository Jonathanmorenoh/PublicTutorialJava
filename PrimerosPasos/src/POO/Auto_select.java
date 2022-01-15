package POO;

import javax.swing.JOptionPane;

public class Auto_select {
    
    public static void main(String[] args) {
        
        Auto tuAuto = new Auto();
        
        tuAuto.setColor(JOptionPane.showInputDialog("Introduce color"));
        
        tuAuto.setAsientosCuero(JOptionPane.showInputDialog("Asientos de cuero (si/no): "));
        
        tuAuto.setClimatizador(JOptionPane.showInputDialog("Climatizador (si/no): "));
        
        System.out.println(tuAuto.getGenerales() + ". " + tuAuto.dime_asientos() + ". " + tuAuto.dime_climatizador() + ", " + tuAuto.pesoAuto());
        
    }
}

