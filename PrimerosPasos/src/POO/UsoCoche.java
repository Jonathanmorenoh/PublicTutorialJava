package POO;

public class UsoCoche {
    
    public static void main(String[] args) {
        
        //CREACION DE OBJETO DE UNA CLASE / INSTANCIAR UNA CLASE / EJEMPLAR DE UNA CLASE
        //ESTRUCTURA ---> nombre_clase  nombre_objeto = new nombre_clase () ;
        
       CochePOO Renault = new CochePOO();
              
//1- SI NO ENCAPSULO PUEDO CAMBIAR LOS VALORES DE LOS ATRIBUTOS
       
//2- Renault.ruedas = 3;
       
//3- AL USAR LOS MODIFICADORES DE ACCESO NO ME PERMITE ACCEDER A LOS ATRIBUTOS
       
//4- System.out.println("Este coche tiene: " + Renault.ruedas + " ruedas.");
   
//5- AHORA DEBO USAR LOS METODOS PARA ACCEDER A LOS ATRIBUTOS
    
        //System.out.println("Este coche tiene: " + Renault.getAncho() + " de largo");

        Renault.setColor("Rojo");
        
        Renault.setAsientosCuero("si");
        
        System.out.println(Renault.getComunes() + ", " + Renault.getColor() + " y " + Renault.dime_asientos() );
    }
    
}
