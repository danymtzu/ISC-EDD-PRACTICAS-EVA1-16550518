/*
PROGRAMA QUE LLENA UNA DIAGONAL CON 1 Y LAS DEMAS POSICIONES CON 0
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
         int aiArreglo[][] = new int[10][10];//100 enteros
        
        //RECORRER Y LLENAR DE VALORES
        for (int i = 0; i < 10; i++) {
           for (int j = 0; j < 10; j++) {
                 if(i==j){//CUANDO LA POSICIÓN DE i SEA IGUAL A LA POSICIÓN DE j SE IMPRIME UN 1 DE CONTRARIO SE IMPRIME UN 0
                     System.out.print("[1]");
                 }else{
                     System.out.print("[0]");
                 }
                 
            }
            System.out.println("");
        }
        
    }
    
}
