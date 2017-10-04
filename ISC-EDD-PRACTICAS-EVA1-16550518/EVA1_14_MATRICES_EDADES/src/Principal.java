
import java.util.Scanner;

/*
PROGRAMA QUE CALCULA EL PROMEDIO DE LAS EDADES DE
DISTINTOS GRUPOS
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
        //PREGUNTAR CUANTOS GRUPOS TIENE
        System.out.println("Cuàntos grupos tiene?");
        Scanner s = new Scanner(System.in);
        int iGrup,iAlu;
        iGrup= s.nextInt();
        //INICIAR LA MATRIZ
        int aGrupo[][];
        aGrupo= new int[iGrup][];//N Grupos
        
         //PREGUNTAR CUANTOS Alumnos tiene en cada grupo
       
        for (int i = 0; i < iGrup; i++) {
            System.out.println("Cuàntos alumnos tiene en el grupo " +i+ " ?");
            iAlu=s.nextInt();
            aGrupo[i]= new int[iAlu];
        }
         for (int i = 0; i < iGrup; i++) {//FILA---> GRUPOS
             for (int j = 0; j < aGrupo[i].length;  j++) {//aGrupo[i].length-> Indica el grupo 
                 System.out.println("Edad Grupo "+ i+ ":");
                 aGrupo[i][j]= s.nextInt();
             }
        }
         //CALCULAR LOS PROMEDIOS
         int iAcum;
         double dProm;
         for (int i = 0; i < iGrup; i++) {
             iAcum =0;
             dProm=0;
             for (int j = 0; j < aGrupo[i].length;  j++) {
                iAcum+= aGrupo[i][j]; //SUMATORIA DE TODAS LAS EDADES
                
             }
             dProm= iAcum/aGrupo[i].length;
             System.out.println("Para el grupo"+ i+ " el promedio de la edades es : "+ dProm);
        }
       
        
  
     
    }
    
}
