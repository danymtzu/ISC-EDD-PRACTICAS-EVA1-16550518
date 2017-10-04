/*
PROGRAMA QUE EXPLICA LA DIFERENCIA ENTRE METODOS Y ATRIBUTOS 
ESTATICOS Y NO ESTATICOS
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
        
        MiClasePrueba mcObjeto = new MiClasePrueba();
        mcObjeto.imprimirMensaje();
        System.out.println(mcObjeto.sNom);
        MiClasePrueba2.imprimirMensaje();//No se hace instancia
        MiClasePrueba2.sNom= "DANIELA MARGUELY";
        System.out.println(MiClasePrueba2.sNom);
    }
    
}



class MiClasePrueba{
    public String sNom= "Daniela";
    public void imprimirMensaje(){
        System.out.println("Hola mundo!!");
    }
}
class MiClasePrueba2{
    public static String sNom= "Daniela";
    public static void imprimirMensaje(){
        System.out.println("Hola mundo!!");
    }
}

