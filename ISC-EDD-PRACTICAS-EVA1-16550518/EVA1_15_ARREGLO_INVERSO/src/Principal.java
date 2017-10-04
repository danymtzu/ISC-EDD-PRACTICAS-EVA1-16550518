
import java.util.Scanner;

/*
 PROGRAMA QUE IMPRIME DE MANERA INVERSA
LOS DATOS QUE INTRODUJO EL USUARIO
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
        
        //PREGUNTAR CUANTOS DATOS VA A INTRODUCIR EL USUARIO
        Scanner s = new Scanner(System.in);
        System.out.println("Cuántos datos va a introducir?");
        int idatos = s.nextInt();
        //INICIAR EL ARREGLO
        int aiDatos[] = new int[idatos];
        //PREGUNTAR Y CAPTURAR LOS DATOS
        for (int i = 0; i < aiDatos.length; i++) {
            System.out.println("Introduzca el " + i + " dato");
            aiDatos[i] = s.nextInt();
        }
        //COPIA DE LOS DATOS INVERSO
        int icont = 0;
        int aiCopia[] = new int[idatos];
        for (int i = aiDatos.length - 1; i >= 0; i--) {
            aiCopia[icont] = aiDatos[i];
            icont++;
        }
        //IMPRIMIR LOS DATOS INVERSO
        System.out.println("El inverso de sus datos es: ");
        for (int i = 0; i < aiCopia.length; i++) {
            System.out.println(aiCopia[i]);
        }
    }

}
