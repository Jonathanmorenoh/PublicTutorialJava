package eventos;

import java.util.Scanner;

public class Excepeciones {
    
    public static void main(String[] args) {
        System.out.println("Que Quieres Hacer?");
        System.out.println("1 - Introducir tus datos");
        System.out.println("2 - Salir del sistema");
        
        Scanner entrada = new Scanner(System.in);
        
        int numero = Integer.parseInt(entrada.nextLine());
        
        if(numero == 2){
            
            System.out.println("Hasta Luego.");
            
            System.exit(0);
            
        }else if(numero == 1){
            
            System.out.println("Ingresa tu nombre");
            Scanner nombre = new Scanner(System.in);
            System.out.println("Ingresa tu edad");
            Scanner edad = new Scanner(System.in);
            
            String nom = nombre.nextLine();
            int ed = Integer.parseInt(edad.nextLine());
            
            System.out.println("Hola  " + nom + "! El proximo a;o tendras " + (ed+1));
   
        }
       System.exit(0);
    
}
    
}
