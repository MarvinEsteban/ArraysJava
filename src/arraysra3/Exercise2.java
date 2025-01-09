package arraysra3;

import java.util.Scanner;
import java.util.Arrays;

/**
 *
 * @author Marvin
 */
public class Exercise2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] num = new int[5];

        int i;
        for (i = 0; i < num.length; i++) {
            System.out.print("Introduce a num: ");
            num[i] = sc.nextInt();

        }
        i = 0;
        for (int j = 4; j > -1; j--) {
            i++;
            System.out.println("Number " + i + " is " + num[j]);

        }

    }
}
