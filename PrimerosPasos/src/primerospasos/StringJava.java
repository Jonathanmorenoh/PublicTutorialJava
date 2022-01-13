package primerospasos;


public class StringJava {

    public static void main(String[] args) {
        //METODOS String.lenght() / .charAt()
        String nombre = "Jonathan Ali Moreno Hernandez";
        System.out.println("Mi nombre es: " + nombre);
        System.out.println("Mi nombre tiene: " + nombre.length() + " letras.");
        System.out.println("La primera letra de mi nombre es:" + nombre.charAt(0));

        //ULTIMA LETRA 
        int ultima_letra;
        ultima_letra = nombre.length();
        System.out.println("ultima_letra = " + nombre.charAt(ultima_letra -1));
    
        //METODO String.substring() OBTENER ELEMENTOS DE UNA CADENA
        String nombre_resumen = nombre.substring(13, 19);
        System.out.println("nombre_resumen = " + nombre_resumen + ".");
    
        //Metodo String.equals /equalIgnoreCase
        String alumno1, alumno2;
        alumno1 = "David";
        alumno2 = "David";
        System.out.println("Nombre de alumnos son iguales?: " + alumno1.equals(alumno2));
        System.out.println("Nombre de alumnos (SIN IMPORTAR MAYUSCULAS) son iguales?: " + alumno1.equalsIgnoreCase(alumno2));
        
    }
}


/*         CLASE STRING

*Estructura String: ---> String + NOMBRE_STRING = "VALOR";

        METODOS PARA STRING:

String.length();   DEVUELVE LA LONGITUD
String.charAt(n);  DEVUELVE LA POSICION DEL CARACTER n
substring(x,y);    DEVUELVE ELEMENTOS QUE SELECCIONEMOS
equals(cadena);
equalsIgnoreCase(cadena);


*/
