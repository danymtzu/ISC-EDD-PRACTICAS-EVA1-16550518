/*
PROGRAMA QUE LLENA UN 
ARREGLO TRIDIMENSIONAL(CUBO)
 */

/**
 *
 * @author 16550518
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int aiCubo[][][] = new int[3][3][3];//27 enteros
        
        //RECORRER Y LLENAR DE VALORES
        for (int i = 0; i < 3; i++) {
             for (int j = 0; j < 3; j++) {
                  for (int k = 0; k < 3; k++) {
                      aiCubo[i][j][k] = (int) (Math.random() *100)+1;
                      
                    }
            }
        }
        //IMPRIMIR
        for (int i = 0; i < 3; i++) {
             for (int j = 0; j < 3; j++) {
                  for (int k = 0; k < 3; k++) {
                      System.out.print("["+ aiCubo[i][j][k]+ "]");
                    }
            }
            System.out.println("");
        }
    }
    
}
