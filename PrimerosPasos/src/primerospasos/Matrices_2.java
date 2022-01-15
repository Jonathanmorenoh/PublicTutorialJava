package primerospasos;

public class Matrices_2 {

    public static void main(String[] args) {

        int bidireccionales[][] = new int[4][5];

        bidireccionales[0][0] = 1;
        bidireccionales[0][1] = 2;
        bidireccionales[0][2] = 3;
        bidireccionales[0][3] = 4;
        bidireccionales[0][4] = 5;

        bidireccionales[1][0] = 6;
        bidireccionales[1][1] = 7;
        bidireccionales[1][2] = 8;
        bidireccionales[1][3] = 9;
        bidireccionales[1][4] = 10;

        bidireccionales[2][0] = 11;
        bidireccionales[2][1] = 12;
        bidireccionales[2][2] = 13;
        bidireccionales[2][3] = 14;
        bidireccionales[2][4] = 15;
        
        bidireccionales[3][0] =16 ;
        bidireccionales[3][1] = 17;
        bidireccionales[3][2] = 18;
        bidireccionales[3][3] = 19;
        bidireccionales[3][4] = 20;
        
        for(int i = 0 ; i < 4; i++){
            
            System.out.println();
            
            for(int j = 0; j < 5; j++){
                
                System.out.print(bidireccionales[i][j] + " ");
            }
        }
        
    }
    
}


/*                  MATRICES BIDIMENCIONALES

Construccion SIMIL de una TABLA con columnas y filas.

*Estructura: 


*/
