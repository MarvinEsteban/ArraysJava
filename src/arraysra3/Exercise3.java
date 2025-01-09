package arraysra3;

import java.util.Scanner;
import java.util.Arrays;

/**
 *
 * @author Marvin
 */
public class Exercise3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] num = new int[5];
        int i;
        double sumPos = 0;
        double sumNega = 0;
        int numsZero = 0;
        double sumo = 0;
        double nego = 0;
        double avrgNega;
        double avrgPos;
        for (i = 0; i < num.length; i++) {
            System.out.print("Introduce a num: ");
            num[i] = sc.nextInt();
            if (num[i] > 0) {
                sumPos += num[i];
                sumo++;
            } else if (num[i] < 0) {
                sumNega += num[i];
                nego++;
            } else {
                numsZero++;
            }
        }
        avrgPos = sumPos / sumo;
        avrgNega = sumNega / nego;

        System.out.println("Average pos is " + avrgPos);
        System.out.println("Average nega is " + avrgNega);
        System.out.println("There are " + numsZero + " zeros");
    }
}
