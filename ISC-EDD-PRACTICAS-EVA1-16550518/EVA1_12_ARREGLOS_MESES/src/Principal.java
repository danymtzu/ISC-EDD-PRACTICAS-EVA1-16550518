
import java.util.Scanner;

/*
PROGRAMA DE ARREGLOS QUE ARROJA EL MES Y LOS DIAS QUE TIENE EL MES
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
        //ASIGNAMOS LOS VALORES EN CADA POSICIÓN DEL ARREGLO
        String asMeses[]= {"ENERO", "FEBRERO","MARZO","ABRIL"
                ,"MAYO","JUNIO", "JULIO","AGOSTO","SEMPTIEMBRE"
                ,"OCTUBRE","NOVIEMBRE","DICIEMBRE"};
        //LOS DIAS QUE TIENE CADA MES LOS ASIGNAMOS EN OTRO ARREGLO
        int aiDias []= {31, 28, 31, 30, 31, 30, 31,
        31, 30, 31, 30, 31};
        //SOLICITAR EL MES AL USUARIO
        int iMes;
        Scanner s = new Scanner(System.in);
        System.out.println("Ingrese un número de mes (1-12) : ");
        iMes = s.nextInt();
        System.out.println("El mes es "+ asMeses[iMes - 1]+ " y tiene "
        +aiDias[iMes - 1]+ " dias");
        
    }
    
}
