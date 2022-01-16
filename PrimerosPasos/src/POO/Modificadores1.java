
package POO;

public class Modificadores1 {
    
    private int mivar = 5;  //SOLO ACCEDO DESDE LA MISMA CLASE
    
    protected int mivar2 = 7;         //ACCEDO DESDE LA MISMA CLASE / PAQUETE / OTRO PAQUETE
    
    String miMetodo(){
        
        return "El valor de mivar2: " + mivar2;
    }
}



/*              MODIFICADORES DE ACCESO 

 * Public: PUEDEN ACCEDER DESDE LA MISMA CLASE / PAQUETE / OTRO PAQUETE

* Defecto: PUEDEN ACCEDER DESDE LA MISMA CLASE / PAQUETE

* Protected: PUEDEN ACCEDER DESDE LA MISMA CLASE / PAQUETE / OTRO PAQUETE

* Private: PUEDEN ACCEDER DESDE LA MISMA CLASE


*/