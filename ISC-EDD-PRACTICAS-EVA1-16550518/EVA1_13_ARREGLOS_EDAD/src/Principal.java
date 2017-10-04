
import java.util.Scanner;

/*
PROGRAMA QUE CAULCULA EL PROMEDIO DE EDADES 
MEDIANTE EL USO DE ARREGLOS
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
        //PREGUNTAR CUANTAS EDADES
        Scanner s = new Scanner(System.in);
        System.out.println("¿Cuàntas edades se van promediar?");
        int iEdad = s.nextInt(); //CANTIDAD DE EDADES A CAPTURAR
        //INICIAR EL ARREGLO
        int aiEdades []= new int[iEdad];
        //Capturar
        for (int i = 0; i < iEdad; i++) {
            System.out.println("Introduce la edad: ");
            aiEdades[i]= s.nextInt();
            
        }
        //CALCULAR EL PROMEDIO
        int iAcumulador= 0;
        for (int iVal : aiEdades) {
            iAcumulador= iAcumulador+ iVal;
        }
        double dProm = iAcumulador/iEdad;
        System.out.println("El promedio es: "+ (dProm)); 
    }
    
}
