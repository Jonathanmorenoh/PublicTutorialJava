package primerospasos;

public class Matrices {
    
    public static void main(String[] args) {
        
        //CREAMOS MATRICES
        
        int[] mi_matriz = new int[5];
        
        int mi_matriz2[] = {5, 10, 15, 20, 25};
        
        //ASIGNAMOS VALORES A LAS MATRICES
        
        mi_matriz[0] = 5;
        mi_matriz[1] = 10;
        mi_matriz[2] = 15;
        mi_matriz[3] = 20;
        mi_matriz[4] = 25;
        
        for(int i = 0; i<5; i++){
            
            System.out.println("Mi matriz: " + i);
        }
        
        for(int x = 0; x < mi_matriz.length; x++){
            System.out.println("Mi matriz2: " + x);
        }
        
    }
  
}


/*                       MATRICES ( ARRAYS O ARREGLOS)

*Estructura: int[] mi_matriz = new int[5];
             TIPO  NOMBRE    =      TAMA;O 

*Asignarle valor: mi_matriz [0] = 15;

*Estructurar y asignar:  int [] mi_matriz = {15, 25, 8, 92}

*/