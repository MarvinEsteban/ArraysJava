package arraysra3;

import java.util.Scanner;
import java.util.Arrays;

/**
 *
 * @author Marvin
 */
public class Exercise4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] num = new int[10];
        int i;
        boolean biggersFirst=true;
        boolean smallersFirst=true;
        for (i = 0; i < num.length; i++) {
            System.out.print("Introduce a number: ");
            num[i] = sc.nextInt();
        }
        for (int j = 0; j <num.length-1; j++) {
            if(num[j]>num[j+1]){
                smallersFirst = false;
            }else if (num[j]<num[j+1]) {
                biggersFirst = false;
            }else{
                
            }
                
        }
        if(biggersFirst == true){
            System.out.println("They are ordered from bigger to smaller.");
            
        }else if(smallersFirst==true){
            System.out.println("They are ordered from smaller to bigger.");
        }else
            System.out.println("They are unordered.");
    }
}
