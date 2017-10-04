/*
PROGRAMA QUE LLENA UNA MATRIZ CON  VALORES ALEATORIOS
ENTRE 1-100 E IMPRIME LA MATRIZ INVERSA DE LA MATRIZ INICIAL
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
       
        int aiCinco[][] = new int[5][5];//25 enteros
        
        //RECORRER Y LLENAR DE VALORES
        for (int i = 0; i < aiCinco.length; i++) {
             for (int j = 0; j < aiCinco.length; j++) {
                  aiCinco[i][j]= (int) (Math.random() *100)+1;
            }
        }
        //IMPRIMIR
        for (int i = 0; i <aiCinco.length; i++) {
             for (int j = 0; j < aiCinco.length; j++) {
                  System.out.print("["+ aiCinco[i][j]+ "]");
            }
            System.out.println("");
        }
        //CREAMOS UNA COPIA DE LA MATRIZ 
     
        int aiCopia[][]= new int[5][5];
        for (int i = (aiCinco.length-1); i >= 0; i--) {
                
            for (int j = (aiCinco.length-1); j >= 0; j--) {
                aiCopia[4-i][4-j]=aiCinco[i][j];
               
                
            }
            
            
        }
        
        System.out.println("\n"+"---MATRIZ INVERSA---");
        

        //IMPRIMIR INVERSO
        for (int i = 0; i < aiCopia.length; i++) {
            for (int j = 0; j < aiCopia.length; j++) {
                System.out.print("["+aiCopia[i][j]+"]");
            }
            System.out.println("");
        }
       
       }
      
        
        
        
    }
    

