/*
PROGRAMA DE ARREGLO 
MULTI REFERENCIAS.
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
        int aiArray3D [][][] = new int[10][2][7];
        
      //LENAMOS EL ARREGLO TRIDIMENSIONAL CON VALORES ALEATORIOS ENTRE 1 Y 100
        for (int i = 0; i < aiArray3D.length; i++) {
            for (int j=0; j < aiArray3D[i].length; j++) {
                for (int k = 0; k < aiArray3D[i][j].length; k++) {
                    aiArray3D[i][j][k] = (int) (Math.random() *100)+1;
                }
            }
        }
        //IMPRIMIR EL ARREGLO
        
        for (int i = 0; i < aiArray3D.length; i++) {
            for (int j=0; j < aiArray3D[i].length; j++) {
                for (int k = 0; k < aiArray3D[i][j].length; k++) {
                    System.out.println("["+aiArray3D[i][j][k]+"]");
                }
            }
        }
    }
    
}
