package primerospasos;

import java.util.Scanner;

public class BuclesJuego {
    public static void main(String[] args) {
        
        //REFUNDICION OPCION 1
        double numero = Math.random();
        int numero_final = (int)(numero*100);
        System.out.println("El numero final es: " + numero_final);
        
        //REFUNDICION OPCION 2
        int aleatorio = (int) (Math.random()*100);
        int numero_elegido = 0;
        int intentos = 0;
        Scanner entrada = new Scanner(System.in);

        //COMPARACION DE NUMEROS
        while(numero_elegido != aleatorio){
            intentos++;
            
            System.out.println("Introduce un numero del 0 al 100");
            
            numero_elegido = entrada.nextInt();
            
            if(aleatorio < numero_elegido){
                System.out.println("Pista: es mas bajo");
            }
            else if(aleatorio > numero_elegido){
                System.out.println("Pista: es mas alto");
            }
            
        }
        System.out.println("Numero correcto, has hecho " + intentos + " intentos.");
    }
}
