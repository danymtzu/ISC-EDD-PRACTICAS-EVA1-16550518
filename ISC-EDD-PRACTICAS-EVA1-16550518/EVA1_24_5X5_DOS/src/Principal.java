/*
PROGRAMA QUE MULTIPLICA LLAS POSICIONES DE DOS MATRICES
Y LLENA OTRA MATRIZ CON LOS RESULTADOS DE LA MULTIPLICACION
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
        double dArrayResult[][]= new double[5][5];
        double dArray1[][]= new double[5][5];
        double dArray2[][]= new double[5][5];
        //LLENAMOS LA MATRIZ 1 Y LA MATRIZ 2
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                dArray1[i][j]= (Math.random()*10)+1;
                dArray2[i][j]= (Math.random()*10)+1;
            }
        }
        //IMPRIMIMOS LA MATRIZ 1
         System.out.println("---MATRIZ 1---");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
               
                System.out.print("["+ dArray1[i][j]+"] ");
            }
            System.out.println("");
        }
        System.out.println("---MATRIZ 2---");
        //IMPRIMIMOS LA MATRIZ 2
         for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                
                System.out.print("["+ dArray2[i][j]+"] ");
            }
            System.out.println("");
        }
        //MULTIPLICAMOS E IMPRIMIMOS LA MATRIZ LOS VALORES DE LA MATRIZ
          System.out.println("---RESULTADOS---");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                dArrayResult[i][j]= dArray1[i][j]*dArray2[i][j];
               
                System.out.print("[" + dArrayResult[i][j] + "]");
            }
            System.out.println("");
        }
    }
    
}
