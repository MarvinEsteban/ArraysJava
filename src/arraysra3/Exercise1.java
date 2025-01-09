package arraysra3;
import java.util.Scanner;
import java.util.Arrays;
/**
 *
 * @author Marvin
 */
public class Exercise1 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
        int[]num = new int[5];
        
            for (int i = 0; i < num.length; i++) {
                System.out.print("Introduce a number: ");
                num[i]=sc.nextInt();
            }
        
        /*num[1]=sc.nextInt();
        num[2]=sc.nextInt();
        num[3]=sc.nextInt();
        num[4]=sc.nextInt();*/
        
            for (int i = 0; i < num.length; i++) {
                System.out.println("Number " + i+ " es " + num[i]);
            }
    }
}
