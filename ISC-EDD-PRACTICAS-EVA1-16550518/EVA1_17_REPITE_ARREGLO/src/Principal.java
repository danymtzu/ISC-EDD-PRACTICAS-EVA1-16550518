
import java.util.Scanner;

/*
PROGRAMA QUE BUSCA EL VALOR QUE SE REPITE DENTRO DEL ARREGLO
Y CUENTA CUANTAS VECES SE REPITE EL VALOR
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

        //PEDIR LOS DATOS
        Scanner s = new Scanner(System.in);
        System.out.println("¿Cuántos datos va a introducir?");
        int idatos = s.nextInt();
        //INICIAR Y LLENAMOS EL ARREGLO
        int arreglo[] = new int[idatos];
        for (int i = 0; i < arreglo.length; i++) {
            System.out.println("Introduzca el" + (i + 1) + " dato: ");
            arreglo[i] = s.nextInt();
        }
        //PREGUNTAMOS EL NÚMERO QUE SE BUSCARÁ
        System.out.println("¿Qué numero deseas buscar?");
        int buscado = s.nextInt();
        int cont = 0;//CREAMOS UN CONTADOR PARA LAS REPETICIONES DEL NÚMERO
        //SI EL ARREGLO EN LA POSICIÓN i ES IGUAL AL VALOR QUE INTRODUJO EL 
        //USUARIO SE INCREMENTA UNA UNIDAD EL CONTADOR
        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i] == buscado) {
                cont++;

            }

        }
        //IMPRIMIMOS EL NÚMERO DE VECES QUE SE REPITE EL NÚMERO 
        System.out.println("El número " + buscado + " se repite: " + cont);
    }

}
