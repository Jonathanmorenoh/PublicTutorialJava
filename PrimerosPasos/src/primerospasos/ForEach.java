package primerospasos;

public class ForEach {
 
    public static void main(String[] args) {
        
        //CREAMOS MATRIZ
        
        String paises[] = new String[8];
        
        //ASIGNAMOS VALORES
        
        paises[0] = "Espa;a";
        paises[1] = "Mexico";
        paises[2] = "Colombia";
        paises[3] = "Argentina";
        paises[4] = "Venezuela";
        paises[5] = "Canada";
        paises[6] = "Francia";
        paises[7] = "Alemania";
        
        //IMPRIMIMOS con FOR EACH
        
        for(String NOMBRE:paises){
            System.out.println("Nombre de los paises: " + NOMBRE);
        }
        
        
        
        
    }
}
