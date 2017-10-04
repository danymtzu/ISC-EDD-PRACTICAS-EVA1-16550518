
import java.util.Scanner;

/*
PROGRAMA QUE BUSCA EL VALOR MÍNIMO Y EL VALOR MÁXIMO EN UN ARREGLO
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
        
//PEDIR LOS DATOS AL USUARIO
        Scanner s= new Scanner(System.in);         
             
        System.out.println("¿Cuántos datos va a introducir?");
        int idatos = s.nextInt();
       //INICIAR EL ARREGLO
        int arreglo[]=new int [idatos];
        for (int i = 0; i < arreglo.length; i++) {
            System.out.println("Introduzca el " + (i+1) + " datos");
            arreglo[i]=s.nextInt();
        }
        //BUSCAR EL VALOR MINIMO Y MAXIMO
        int min= arreglo[0], max=arreglo[0];
        for (int i = 0; i < arreglo.length; i++) {
            if(arreglo[i]<min){
               min= arreglo[i];
                
            }
            if (arreglo[i]> max) {
                max=arreglo[i];
            }
            
        }
        System.out.println("El valor menor es: " +min+ "\n" + "El valor maximo es: "+ max);
    }
    
}
