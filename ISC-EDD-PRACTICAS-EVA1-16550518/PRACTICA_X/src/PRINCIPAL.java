
import java.util.Arrays;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author temporal2
 */
public class PRINCIPAL {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int arrayofItems[]=new int[10000];
        for (int i = 0; i < arrayofItems.length; i++) {
            arrayofItems[i]= (int) (Math.random()*100)+1;
        }
        
//        arrayofItems[0]=1;
//        arrayofItems[1]=2;
//        arrayofItems[2]=3;
        for (int firstItem : arrayofItems) {
            for (int secondItem : arrayofItems) {
                int[] orderPair=new int []{firstItem, secondItem};
                System.out.println(Arrays.toString(orderPair));
            }
        }
    }
    
}
