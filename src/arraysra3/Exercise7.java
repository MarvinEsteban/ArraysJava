package arraysra3;

import java.util.Scanner;

/**
 *
 * @author Marvin
 */
public class Exercise7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i;
        int[]num=new int[10];
        for (i = 0; i < num.length; i++) {
            System.out.print("Introduce a number: ");
            num[i]=sc.nextInt();
            
        }
        System.out.println("=========================");
        for (i = 0; i < num.length; i++) {
            
            System.out.println("Position "+i+": "+num[i]);
        }System.out.println("========================");
        i=0;
        for (int j = num.length-1; j > -1; j--) {
            System.out.println("Position "+i+":"+num[j]);
            i++;
        }
    }
}
