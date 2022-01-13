package primerospasos;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class EntradasYsalidas {

    public static void main(String[] args) {

        //ENTRADAS CON SCANNER
        Scanner consola = new Scanner(System.in);
        System.out.println("Introduce tu nombre: ");
        String nombre = consola.nextLine();

        System.out.println("Introduce tu edad");
        int edad = consola.nextInt();

        System.out.println("Hola " + nombre + " tu edad es " + edad);

        //ENTRADAS CON JoptionPane
        String Nombre_usuario = JOptionPane.showInputDialog("Introduce tu nombre: ");

        String edad_usuario = JOptionPane.showInputDialog("Introduce tu edad:");
        int edad_usuario_int = Integer.parseInt(edad_usuario);
       
        System.out.println("Hola " + Nombre_usuario + " tu edad es " + edad_usuario);

    }

}


/*                ENTRADAS Y SALIDAS

* ENTRADAS:

DINAMICOS  ***(IMPLICA QUE HAY QYE USAR UN OBJECT ANTES DEL METODO)***
- Clase Scanner: Permite ENTRAR informacion desde la consola.
        OBJETO.nextLine();  TEXTO
        OBJETO.next.Int();  ENTEROS
        OBJETO.nextDouble();DECIMALES

ESTATICOS ***(IMPLICA QUE HAY QUE USAR LA CLASE ANTES DEL METODO)***
- Clase JoptionPane: Emite una VENTANA para ENTRAR informacion.
        JoptionPane.showInputDialog();

 */

 /*              CONSTRUCTORES 
-SON UN METODO ESPECIAL
-PERMITEN LA CONSTRUCCION DE OBJETOS
-LLEVAN DE NOMBRE EL MISMO NOMBRE DE LA CLASE A LA QUE PERTENECE
-EXISTEN MUCHOS CONSTRUCTORES DEPENDIENDO DE LOS ARGUMENTOS QUE SE LES DE
 */
