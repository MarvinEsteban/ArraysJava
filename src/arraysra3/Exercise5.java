package arraysra3;
import java.util.Scanner;
import java.util.Arrays;
/**
 *
 * @author Marvin
 */
public class Exercise5 {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[]num = new int[10];
        int i;
            for (i = 0; i < num.length; i++) {
                System.out.print("Introduce a number: ");
                num[i]=sc.nextInt();
            }i=0;
            System.out.println(num[i+9]);
            for (int j = 0; j < num.length-1; j++) {
                System.out.println(num[j]);
            }
    }
}
