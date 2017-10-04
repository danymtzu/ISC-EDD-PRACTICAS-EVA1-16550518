
import java.util.Scanner;

/*
PROGRMA QUE PIDE EDADES AL USUARIO
Y CALCULA LA MEDIA, MODA Y DESVIACIÓN 
ESTANDAR DE LA EDADES
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
        //PREGUNTAR LA CANTIDAD DE EDADES QUE VA A INTRODUCIR EL USUARIO
        System.out.println("¿Cuántas edades va a introducir?");
        Scanner s = new Scanner(System.in);
        int iCantidad, iEdad;
        iCantidad= s.nextInt();
        
        //INICIAR EL ARREGLO
        int aiEdad[] = new int[iCantidad];
        
        //PREGUNTAR LAS EDADES 
        for (int i = 0; i <aiEdad.length; i++) {
            System.out.println("Introduzca la edad número " +(i+1)+ ": ");
            iEdad= s.nextInt();
            aiEdad[i]= iEdad;
        }
        //CALCULAR LA MEDIA
         int iAcum = 0;
        double dMedia;
        for (int i = 0; i < iCantidad; i++) {
          
          dMedia=0;
             iAcum+= aiEdad[i];//Sumatoria de las edades
           }
        dMedia= iAcum/iCantidad;
        System.out.println("La media de las edades es: "+dMedia);
       
        //CALCULAR LA MODA
        int iModa = 0 ;
        int iMaxReps = 0;
        for(int i=0; i<aiEdad.length; i++){
            int iReps = 0;
        for(int j=0; j<aiEdad.length; j++){
            if(aiEdad[i] == aiEdad[j])
            iReps++;
        }
            if(iReps > iMaxReps){
                iModa = aiEdad[i];
                iMaxReps = iReps;
            }
        }   
    System.out.println("La moda es "+iModa+" y se repite "+iMaxReps+" veces.");
    
    //CALCULAR LA VARIANZA
  double dVarianza=0;
        for (int i = 0; i < aiEdad.length; i++) {
            double dRango= Math.pow(aiEdad[i]-dMedia, 2);
            dVarianza  = dVarianza + dRango;
        }
        dVarianza= dVarianza/iCantidad;
        //CALCULAR LA DESVIACION ESTANDAR
       double dDesviacion;
       dDesviacion= Math.sqrt(dVarianza);
        System.out.println("La desviación estandar es: " +dDesviacion);
        
      
        
}
}
    
    

