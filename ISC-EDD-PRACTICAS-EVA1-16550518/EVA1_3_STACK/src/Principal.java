/*
PROYECTO QUE EXLICA EN FUNCIONAMIENTO DEL STACK
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
         System.out.println("Llamando a A...");
         A();
          System.out.println("Termino llamada a A");
      
        
    }
    public static void A(){
         System.out.println("Llamando a B...");
        B();
        System.out.println("Termino llamada a B");
    }
    public static void B(){
        System.out.println("Llamando a C...");
        C();
        System.out.println("Termino llamada a C");
       
    }
    public static void C(){
        System.out.println("FIN DEL CAMINO");
       
    }
    
}
