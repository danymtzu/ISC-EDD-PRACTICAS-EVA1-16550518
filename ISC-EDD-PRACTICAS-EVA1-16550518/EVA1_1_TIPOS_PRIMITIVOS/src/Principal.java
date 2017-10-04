
import java.util.Scanner;

/*PROYECTO INICIAL PARA CONOCER E IDENTIFICAR LOS TIPOS DE
DATOS PRIMITIVOS EN JAVA*/

/*


*/
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String sNom;
        int iEdad;
        double dSalario;
        
        Scanner s = new Scanner(System.in);
        System.out.println("Introduzca su nombre: ");
        sNom = s.nextLine();
        System.out.println("Introduzca su edad: ");
        iEdad= s.nextInt();
        System.out.println("Introduzca su salario: ");
        dSalario = s.nextDouble();
      
     // 
        
        hacerAlgo(sNom, iEdad, dSalario);
    }
    
    /**
     * Ejemplo para comentarios usando Java
     * @param nombre ejem usando string
     * @param edad ejem usando enteros
     * @param salario ejem usando dobles
     */
    public static void hacerAlgo(String nombre, int edad, double salario){
          System.out.println("\n" + nombre +"\n"+ edad + "\n"+ salario);
    }
    
    
}

// "Static" los metodos estaticos no necesitan ser intansiados para poder ser usados