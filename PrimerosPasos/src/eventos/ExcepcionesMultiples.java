package eventos;

import javax.swing.JOptionPane;

public class ExcepcionesMultiples {

    public static void main(String[] args) {

        try{
            OperacionDivision();
        }catch(ArithmeticException e){
            
            System.out.println("Introduciste un numero 0" + e.getClass().getName());
        }catch(NumberFormatException e){
            
            System.out.println("Introduciste un dato no entero" + e.getClass().getName());
        }

    }

    static void OperacionDivision() {

        int numero1 = Integer.parseInt(JOptionPane.showInputDialog("Ingresa un numerador"));
        int numero2 = Integer.parseInt(JOptionPane.showInputDialog("Ingresa un denominador"));

        System.out.println("El resultado es: " + (numero1 / numero2));

    }
}
