package primerospasos;

import javax.swing.JOptionPane;

public class BuclesDoWhile {

    public static void main(String[] args) {

        String genero = "";

        do {
            genero = JOptionPane.showInputDialog("Ingresa tu genero (H/M):");

        } while (genero.equalsIgnoreCase("H") == false && genero.equalsIgnoreCase("M") == false);

        int altura = Integer.parseInt(JOptionPane.showInputDialog("Introduce tu altura en cm"));

        int peso_ideal = 0;

        if (genero.equalsIgnoreCase("H")) {
            peso_ideal = altura - 110;

        } else if (genero.equalsIgnoreCase("M")) {
            peso_ideal = altura - 120;
        }
        System.out.println("Tu peso ideal es: " + peso_ideal + " Kg");
    }

}


/*  
-BUCLE DO... WHILE: PRIMERO HACE LA ACCION Y LUEGO ESTA LA CONDICION
                    ASEGURA QUE AL MENOS UNA VEZ SE EJECUTARA LA ACCION

-ESTRUCTURA: Do{LINEAS DE CODIGO DE ACCIONES} while(condicion)

*/
