package arraysra3;

import java.util.Scanner;

/**
 *
 * @author Marvin
 */
public class Exercise10 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] num = new int[10];
        int number, position;
        System.out.println("Introduce 8 numbers: ");
        for (int i = 0; i < 8; i++) {
            System.out.print("Number " + (i + 1) + ": ");
            num[i] = sc.nextInt();

        }
        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i]+" ");
        
        }System.out.println(" ");
        System.out.println("==========================");
        System.out.println("Now fill the other 2 with a number and a position:");
        for (int j = 0; j < 2; j++) {
            System.out.print("Introduce a number: ");
            number = sc.nextInt();
            System.out.print("Introduce the position: ");
            position = sc.nextInt();

            if (position >= 0 && position < num.length) {
                for (int i = num.length-1; i > position; i--) {
                    num[i]=num[i-1];
                }
               num[position]=number;
        
        }
        }
        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i]+" ");
        
            }
    }

}
