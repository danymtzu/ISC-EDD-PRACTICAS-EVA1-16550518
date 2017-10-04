/*
PROGRAMA QUE EXPLICA LA REFRENCIA EN LA MEMORIA(APUNTADORES).
 */

/**
 *
 * @author temporal2
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int i=5;
        System.out.println("i = " + i);
        //Crear una copia de "i"
            int iCopia= i;//Asignamos el valor de "i" a la variable iCopia
        System.out.println("Copia de i = " +iCopia);
            i++;
        System.out.println("i++ ="+ i);
        System.out.println("iCopia ="+ i);
        //Declarar un obejto de tipo numero
        Numero nVal = new Numero(); //Creamos el objeto
        System.out.println("Valor de nVal.i =" + nVal.i);
            Numero nCopiaVal = nVal; //Creamos una "copia" <---No es una copia solo se copian las referencias
        System.out.println("Valor de nCopiaVal ="+ nCopiaVal.i);
            nVal.i++;
        //Imprimimos nVal y nCopiaVal
        System.out.println("Valor de nVal =" + nVal.i);
        System.out.println("Valor de nCopiaVal ="+ nCopiaVal.i);
        //Imprimir Objetos
        System.out.println(nVal);
        System.out.println(nCopiaVal);
        
        //COPIA REAL DE UN OBJETO(Se tiene que crear atributo por atributo).
        Numero nCopiaReal = new Numero();
        nCopiaReal.i =nVal.i;
        System.out.println("Valor de nVal.i =" + nVal.i);
        System.out.println("Valor de nCopiaReal.i ="+ nCopiaReal.i);
            nVal.i++;
        System.out.println("Valor de nVal.i =" + nVal.i);
        System.out.println("Valor de nCopiaReal.i ="+ nCopiaReal.i);
        //Para ver si son diferentes objetos se imprimen los objetos
        System.out.println(nVal);
        System.out.println(nCopiaReal);
    }
    
}

class Numero{
    public int i =10;
    
}