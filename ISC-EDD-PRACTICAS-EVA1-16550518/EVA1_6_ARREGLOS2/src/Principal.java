
import java.util.Scanner;

/*
 PROGRAMA UQE EXPLICA COMO HACER EL DUPLICADO DE UN ARREGLO
 */

/**
 *
 * @author 16550518
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static final int TAMA_ARRE= 5;//Se declara una constante para que sea mas facil cambiar el tamaño del arreglo
   
    public static void main(String[] args) {
        // TODO code application logic here
        int aiEdad[];
        aiEdad = new int [TAMA_ARRE];
        Scanner s = new Scanner(System.in);
        for (int i = 0; i < aiEdad.length; i++) {
            System.out.println("Introduce una edad: ");
            aiEdad[i]= s.nextInt();
            
        }
     //IMPRIMIR
        for(int x : aiEdad){
            System.out.println("Edades: "+ x);
        }
        //CREAR UN DUPLICADO
        int aiCopiaEdad[];
      /*  aiCopiaEdad= aiEdad; */ //no crea un duplicado
        aiCopiaEdad = new int [TAMA_ARRE];
        for (int i = 0; i < aiCopiaEdad.length; i++) {
            
            aiCopiaEdad[i]= aiEdad[i];
        }
        for( int x : aiCopiaEdad){
            System.out.println("Copia edad: "+ x);
        }
        System.out.println(aiCopiaEdad);
        System.out.println(aiEdad);
    }
    
}
