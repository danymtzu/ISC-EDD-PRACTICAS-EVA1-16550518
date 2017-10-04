
import java.util.Scanner;

/*
PROGRAMA QUE BUSCA EL DATO DENTRO
DEK ARREGLO Y TE DA LA POSICION DEL DATO.
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
        //PREGUNTAR LOS DATOS
        Scanner s= new Scanner(System.in);         
             
        System.out.println("¿Cuántos datos va a introducir?");
        int idatos = s.nextInt();
       
        //INICIAR EL ARREGLO
        int arreglo[]=new int [idatos];
        for (int i = 0; i < arreglo.length; i++) {
            System.out.println("Introduzca el " + (i+1) + " datos");
            arreglo[i]=s.nextInt();
        }
        
        //PREGUNTAR Y BUSCAR EL VALOR
        
        System.out.println("¿Qué dato vas a buscar?");
        int buscado=s.nextInt();
        
        //SI EL VALOR QUE QUIERE BUSCAR EL ARREGLO ES IGUAL A ALGUN VALOR DEL ARREGLO
        //SE IMPRIME EL VALOR Y LA POSICIÓN DEL VALOR
        for (int i = 0; i <arreglo.length; i++) {
            if(arreglo[i]==buscado){
                System.out.println("El dato "+buscado+
                        " se encuentra en la posición: "+
                        (i+1)+ " dentro del arreglo. ");
                break;
            }
            
        }
        
    }
    
}
