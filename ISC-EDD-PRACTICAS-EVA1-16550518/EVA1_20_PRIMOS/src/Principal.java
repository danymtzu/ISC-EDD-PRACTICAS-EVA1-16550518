
import java.util.Scanner;

/*
PROGRAMA QUE CALCULA SI UN NÚMERO
ES PRIMO O NO ES PRIMO
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
       
        //SE PIDE UN NÚMERO AL USUARIO PARA ANALIZARLO
        Scanner s = new Scanner(System.in);
        System.out.println("Introduce un número a analizar: ");
        int n = s.nextInt();
        int resultado;

        /*   for (int i = 2; i < n; i++) {
            resultado= n%2;
            if (resultado==0) {
                System.out.println("El número no es primo");
                break;
            }
        }*/
        int raiz = (int) Math.sqrt(n);//CALCULAMOS LA RAIZ DEL NÚMERO 
        /*SI EL RESIDUO  NUMERO DIVIDIDO ENTRE 2 DOS ES IGUAL A CERO EL NÚMERO 
        NO ES PRIMO YA QUE LOS PARES SON LOS UNICOS DIVISIBLES ENTRE DOS 
        Y QUE SU RESULTADO SEA CERO*/
        for (int i = 2; i < raiz; i++) {
            resultado = n % 2;
            if (resultado == 0) {
                System.out.println("El número no es primo");
                break;
            }
        }

    }

}
