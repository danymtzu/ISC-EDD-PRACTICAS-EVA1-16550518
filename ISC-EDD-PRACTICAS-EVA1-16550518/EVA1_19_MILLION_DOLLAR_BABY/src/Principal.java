/*
PROGRAMA QUE EXPLICA CUANTO TIEMPO LE TOMA A
NUESTROS ALGORITMOS EJECUTAR UNA INSTRUCCION
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
      int aiMillon[]= new int [300000000];
        for (int i = 0; i < aiMillon.length; i++) {
            aiMillon[i]= (int) (Math.random()*100)+1;
        }
        
    }
    
}
