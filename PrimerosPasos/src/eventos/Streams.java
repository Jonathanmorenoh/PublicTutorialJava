
package eventos;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Streams {
    
    public static void main(String[] args) {
        
        leeFichero acceder = new leeFichero();
        
        acceder.lee();
        
    }
    
}

class leeFichero{

    public void lee(){
        
        try {
            
            entrada = new FileReader("C:/Users/Daniela Goyo/Desktop/ejemplo.txt");
            
            int c = entrada.read();
            
            while(c!= -1){
                
                c = entrada.read();
                
                char letra = (char)c;
                
                System.out.print(letra);
            }
            
            
        } catch (IOException ex) {
            
            System.out.println("FALLAS: " + ex.getClass().getName());

        }finally{
            
            try {
                
                entrada.close();
                
            } catch (IOException ex) {
                Logger.getLogger(leeFichero.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
 
    }
           FileReader entrada;

}







/*      USO DE API

** SI QUIERO USAR UNA CLASE: INSTANCIO CON UN CONSTRUCTOR
------> FileReader mientrada = new FileReader(INGRESO LOS ARGUMENTOS DEL CONSTRUCTOR QUE QUIERA);

OJO: SI LA CLASE YA ESTA HEREDADA EN LA CLASE PADRE: USAR EL METODO DIRECTO
---> mientrada.     



** SI QUIERO USAR UN METODO:
------> USO EL NOMBRE QUE LE DI A LA INSTANCIA DE LA CLASE Y COLOCO UN PUNTO '.' y LUEGO EL METODO
mientrada.read();

OJO: SI EL METODO ES STATIC USAR EL NOMBRE DE LA CLASE
---> mientrada.FileReader.read();


*/