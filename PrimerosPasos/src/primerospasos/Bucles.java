package primerospasos;

import javax.swing.JOptionPane;

public class Bucles {

    public static void main(String[] args) {

        String clave = "Jonathan";

        String pass = "";
        
      //MIENTRAS:  CLAVE SEA IGUAL A PASS == FALSO ENTONCES HACER...
        while (clave.equals(pass) == false) {
            
            pass = JOptionPane.showInputDialog("Introduce tu contrasena");
            
            if(clave.equals(pass) == false){
                System.out.println("Contrasena incorrecta");
            }
        }
        
        System.out.println("Contrasena correcta");
    }

}


/*              BUCLES 

*BUCLES INDETERMINADOS: NO SE SABE CUANTAS VECES SE REPETIRA EL BUCLE

-WHILE -->      while(mientras la condicion sea verdadera){Lineas de codigo que quiero repetir mientras la condicion es verdadera}

-DO WHILE -->





*BUCLES DETERMINADOS: SI SE SABE CUANTAS VECES SE REPETIRA EL BUCLE


 */
