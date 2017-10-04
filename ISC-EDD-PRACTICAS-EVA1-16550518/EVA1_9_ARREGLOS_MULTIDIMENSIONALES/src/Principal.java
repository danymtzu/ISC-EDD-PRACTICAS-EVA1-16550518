/*
 PROYECTO QUE EXPLICA COMO FUNCIONAN LOS ARREGLOS COMO MATRICES
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
        //ARREGLOS  MILTIDIMENSIONALES ARREGLOS DE ARREGLOS
        //MATRIZ DE 2 X 2
        int aiMatriz [][]= new int [2][2];//4 enteros
        //llenar con valores aleatorios
        for (int i = 0; i < 2; i++) {//recorre cada fila
            for (int j = 0; j < 2; j++) {//recorre cada columna
                aiMatriz[i][j]= (int)(Math.random()*10)+1;//llenamos con valores aleatorios de 1-10
            }
            
        }
        //IMPRIMIR
        for (int i = 0; i < 2; i++) {//recorre cada fila
            for (int j = 0; j < 2; j++) {//recorre cada columna
                System.out.print("["+ aiMatriz[i][j]+ "]");
                
            }
            System.out.println("");
            
        }
        //IMPRIMIR LA MATRIZ USANDO FOR EACH
        for (int[] aiMatriz1 : aiMatriz) { //REGRESA EL ARREGLO COMPLETO QUE ESTA EN ESA POSICION(REGRESA CADA FILA)
                //USANDO OTRO FOR EACH
            for (int b : aiMatriz1) {//RRECORRE LAS COLUMNAS
                System.out.print("["+ b + "]");
            }
                System.out.println("");
            }
        
    }
    
}
