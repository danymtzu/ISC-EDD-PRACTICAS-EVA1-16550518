/*
PROGRAMA  QUE EXPLICA COMO CREAR ARREGLOS
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
        int aiMisNum [] = new int [10];
        for (int i = 0; i < 10; i++) {
            aiMisNum[i] = (int) (Math.random()* 10 + 1);
            
        }
        //FOR EACH 
        for(int x : aiMisNum){//int x; for(int i = 0; i < 10; i++) {}
            System.out.println("x = " + x);
    }
        //MULTIPLES ARREGLOS 
        int [] aiArreglo1, aiArreglo2, aiArreglo3; //<--- Todos son arreglos porque los corchetes esta antes
        aiArreglo1 = new int [3];
        aiArreglo2 = new int [10];
        aiArreglo3 = new int [100];
        
        //ARREGLOS Y VARIABLES
        int aiArre[], iVar, iVar2; //<--- El 1ero es un arreglo los demas son variables
        aiArre = new int[10];
        iVar= 10;
        iVar2 =10;
        
    }
    
}
