
import java.util.Scanner;

/*
 PROGRAMA QUE INDICA EL CLIMA
 DE LA CUIDAD DE CHIHUAHUA
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
        double adClima[][] = new double[10][12];

        adClima[0][0] = 30.0;
        adClima[0][1] = 32.0;
        adClima[0][2] = 34.0;
        adClima[0][3] = 38.8;
        adClima[0][4] = 39.6;
        adClima[0][5] = 41.4;
        adClima[0][6] = 41.6;
        adClima[0][7] = 39.2;
        adClima[0][8] = 39.0;
        adClima[0][9] = 35.0;
        adClima[0][10] = 34.6;
        adClima[0][11] = 29.0;
        adClima[1][0] = 18.1;
        adClima[1][1] = 21.2;
        adClima[1][2] = 24.2;
        adClima[1][3] = 27.9;
        adClima[1][4] = 32.2;
        adClima[1][5] = 34.0;
        adClima[1][6] = 32.1;
        adClima[1][7] = 30.3;
        adClima[1][8] = 29.0;
        adClima[1][9] = 26.8;
        adClima[1][10] = 21.9;
        adClima[1][11] = 18.2;
        adClima[2][0] = 10.0;
        adClima[2][1] = 12.9;
        adClima[2][2] = 15.7;
        adClima[2][3] = 19.2;
        adClima[2][4] = 23.6;
        adClima[2][5] = 26.3;
        adClima[2][6] = 25.6;
        adClima[2][7] = 24.3;
        adClima[2][8] = 22.6;
        adClima[2][9] = 18.7;
        adClima[2][10] = 13.7;
        adClima[2][11] = 10.3;
        adClima[3][0] = 2.0;
        adClima[3][1] = 4.5;
        adClima[3][2] = 7.1;
        adClima[3][3] = 10.4;
        adClima[3][4] = 14.9;
        adClima[3][5] = 18.6;
        adClima[3][6] = 19.1;
        adClima[3][7] = 18.2;
        adClima[3][8] = 16.0;
        adClima[3][9] = 10.7;
        adClima[3][10] = 5.5;
        adClima[3][11] = 2.4;
        adClima[4][0] = -12.8;
        adClima[4][1] = -18.0;
        adClima[4][2] = -5.8;
        adClima[4][3] = -3.4;
        adClima[4][4] = 3.8;
        adClima[4][5] = 6.1;
        adClima[4][6] = 10.6;
        adClima[4][7] = 10.0;
        adClima[4][8] = 3.7;
        adClima[4][9] = -2.4;
        adClima[4][10] = -6.1;
        adClima[4][11] = -11.5;
        adClima[5][0] = 9.9;
        adClima[5][1] = 3.7;
        adClima[5][2] = 7.7;
        adClima[5][3] = 12.9;
        adClima[5][4] = 26.1;
        adClima[5][5] = 34.7;
        adClima[5][6] = 94.7;
        adClima[5][7] = 89.3;
        adClima[5][8] = 66.4;
        adClima[5][9] = 21.6;
        adClima[5][10] = 8.7;
        adClima[5][11] = 9.9;
        adClima[6][0] = 2.5;
        adClima[6][1] = 1.6;
        adClima[5][2] = 1.5;
        adClima[6][3] = 2.5;
        adClima[6][4] = 4.0;
        adClima[6][5] = 6.7;
        adClima[6][6] = 11.4;
        adClima[6][7] = 12.0;
        adClima[6][8] = 8.0;
        adClima[6][9] = 4.0;
        adClima[6][10] = 2.0;
        adClima[6][11] = 2.3;
        adClima[7][0] = .30;
        adClima[7][1] = .18;
        adClima[7][2] = .09;
        adClima[7][3] = .09;
        adClima[7][4] = 0.0;
        adClima[7][5] = 0.0;
        adClima[7][6] = 0.0;
        adClima[7][7] = 0.0;
        adClima[7][8] = 00.0;
        adClima[7][9] = 0.0;
        adClima[7][10] = .50;
        adClima[7][11] = .88;
        adClima[8][0] = 55.0;
        adClima[8][1] = 49.0;
        adClima[8][2] = 39.0;
        adClima[8][3] = 37.0;
        adClima[8][4] = 37.0;
        adClima[8][5] = 42.0;
        adClima[8][6] = 53.0;
        adClima[8][7] = 61.0;
        adClima[8][8] = 61.0;
        adClima[8][9] = 56.0;
        adClima[0][10] = 55.0;
        adClima[8][11] = 57.0;
        adClima[9][0] = 185.0;
        adClima[9][1] = 204.0;
        adClima[9][2] = 204.0;
        adClima[9][3] = 278.0;
        adClima[9][4] = 299.0;
        adClima[9][5] = 273.0;
        adClima[9][6] = 240.0;
        adClima[9][7] = 242.0;
        adClima[9][8] = 229.0;
        adClima[9][9] = 238.0;
        adClima[9][10] = 191.0;
        adClima[9][11] = 174.0;

        String sTemp = "";
        int iMes, i=0;
        Scanner s = new Scanner(System.in);
        //PREGUTAMOS QUE QUIERE SABER
        System.out.println("¿Qué quiere saber acerca del clima de Chihuahua?");
        System.out.println("Temperatura más alta (ºC) = a");
        System.out.println("Promedio de la temperatura más alta(ºC)= b");
        System.out.println("Media Diaria de la temperatura (ºC) =c");
        System.out.println("Promedio de la temperatura más baja (ºC )= d");
        System.out.println("Temperatura más baja (ºC)= e");
        System.out.println("Promedio de lluvia en milimetros= f");
        System.out.println("Promedio de días lluviosos= g");
        System.out.println("Promedio de los días nevados= h");
        System.out.println("Promedio de la humedad (%)= i");
        System.out.println("Media mensual de las horas del sol = j");
        
        sTemp = s.next();

        switch (sTemp) {
            case "a":
                i = 0;
                break;
            case "b":
                i = 1;
                break;
            case "c":
                i = 2;
                break;
            case "d":
                i = 3;
                break;
            case "e":
                i = 4;
                break;
            case "f":
                i = 5;
                break;
            case "g":
                i = 6;
                break;
            case "h":
                i = 7;
                break;
            case "i":
                i = 8;
                break;
            case "j":
                i = 9;
                break;

        }
        
        System.out.println("Intrudce el número de mes");
        iMes = s.nextInt()-1;
        
        System.out.println("El resultado es: " + adClima[i][iMes]);

    }

}
