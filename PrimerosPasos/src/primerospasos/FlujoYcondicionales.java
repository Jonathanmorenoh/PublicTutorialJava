package primerospasos;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class FlujoYcondicionales {

    public static void main(String[] args) {

        //CREAMOS EL PEDIDO DE INFORMACION
        Scanner consola = new Scanner(System.in);
        System.out.println("Ingresa tu edad");
        int edad = consola.nextInt();

        //CONDICIONAL IF
        if (edad < 18) {
            System.out.println("Eres adolescente");
        } else if (edad < 45) {
            System.out.println("Eres adulto");
        } else {
            System.out.println("Eres adulto mayor");
        }

        //CREAMOS EL PEDIDO DE INFORMACION
        Scanner entrada = new Scanner(System.in);
        System.out.println("Elige una figura geometrica: \n1: Cuadradado \n2: Rectangulo \n3: Triangulo");
        int figura = entrada.nextInt();

        //CONDICIONAL SWITCH
        switch (figura) {
            case 1:
                String lado = JOptionPane.showInputDialog("Introduce el lado en cm");
                int lado_int = Integer.parseInt(lado);
                System.out.println("El area del cuadrado es: " + Math.pow(lado_int, 2));
                break;

            case 2:
                int base = Integer.parseInt(JOptionPane.showInputDialog("Introduce la base en cm"));
                int altura = Integer.parseInt(JOptionPane.showInputDialog("Introduce la altura en cm"));
                System.out.println("El area del rectangulo es: " + base * altura);
                break;

            case 3:
                base = Integer.parseInt(JOptionPane.showInputDialog("Introduce la base en cm"));
                altura = Integer.parseInt(JOptionPane.showInputDialog("Introduce la altura en cm"));
                System.out.println("El area del triangulo es: " + (base * altura / 2));
                break;
                
            default :
              System.out.println("Figura no encontrada");
        }

    }

}

/*          CONDICIONALES Y BUCLES

*CONDICIONALES 

-if(condicion){}else{}

-switch(valor a evaluar){}

 */
