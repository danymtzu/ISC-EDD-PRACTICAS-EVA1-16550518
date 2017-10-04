/*
PROGRAMA QUE EXPLICA COMO FUNCIANAN LOS ARREGLOS EN LOS OBJETOS
 */

/**
 *
 * @author 16550518
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static final int tam=10;
    public static void main(String[] args) {
        // TODO code application logic here
        Alumno aaDatos []; // El identificador es nulo
        
        aaDatos = new Alumno[tam];//Creamos un arreglo de 10 
                                 //alumnos - AQUI HABRA PREGUNTA
        for (int i = 0; i < aaDatos.length; i++) {
            aaDatos[i]= new Alumno("Dany","16550518", 0);//Para cada lugar de arreglo se crea un objeto de la clase alumno
            
        }
        for (Alumno aaDatos1: aaDatos) {
            System.out.println("Nombre: "+ aaDatos1.getsNom());
            System.out.println("Marticula: "+ aaDatos1.getsMatri());
            System.out.println("Carrera: "+ aaDatos1.getiCar());
            
        }
        
        
        //CREAMOS UNA COPIA DEL ARREGLO
        Alumno aaCopiaDatos [];
        aaCopiaDatos = new Alumno [tam];
        
        for (int i = 0; i < aaCopiaDatos.length; i++) {
            aaCopiaDatos[i]= new Alumno(aaDatos[i].getsNom(), // <<<Se llenan todos los datos que pide el constructor por argumentos
                                        aaDatos[i].getsMatri(), 
                                        aaDatos[i].getiCar());
            
        }
        for (Alumno aaCopiaDatos1 : aaCopiaDatos) {
            System.out.println("Nombre: "+  aaCopiaDatos1.getsNom());
            System.out.println("Marticula: "+ aaCopiaDatos1.getsMatri());
            System.out.println("Carrera: "+ aaCopiaDatos1.getiCar());
        }
        System.out.println(aaDatos);
        System.out.println(aaCopiaDatos);
    }
    
}
//0--> Sistemas
class Alumno{
    private String sNom;
    private String sMatri;
    private int iCar;

    public Alumno(String sNom, String sMatri, int iCar) {
        this.sNom = sNom;
        this.sMatri = sMatri;
        this.iCar = iCar;
    }

    public String getsNom() {
        return sNom;
    }

    public void setsNom(String sNom) {
        this.sNom = sNom;
    }

    public String getsMatri() {
        return sMatri;
    }

    public void setsMatri(String sMatri) {
        this.sMatri = sMatri;
    }

    public int getiCar() {
        return iCar;
    }

    public void setiCar(int iCar) {
        this.iCar = iCar;
    }
    
    
    
    
}