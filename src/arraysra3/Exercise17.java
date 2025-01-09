package arraysra3;

import java.util.Scanner;

/**
 *
 * @author Marvin
 */
public class Exercise17 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i;
        int j;
        int sum = 0;
        int[][] table = new int[5][5];
        for (i = 0; i < table.length; i++) {
            for (j = 0; j < table.length; j++) {
                sum = i + j;
                if ((sum % 2 == 0) && (sum != 1)) {
                    System.out.print("Introduce a pair number: ");
                    table[i][j] = sc.nextInt();
                    if (table[i][j] % 2 != 0) {
                        System.out.println("null, swiching to 0");
                        table[i][j]=0;
                    }
                } else {
                    System.out.print("Introduce an odd number: ");
                    table[i][j] = sc.nextInt();
                    if (table[i][j] % 2 == 0) {
                        System.out.println("null, switching to 1");
                        table[i][j]=1;
                        
                    }
                }

            }
        }

        for (i = 0; i < table.length; i++) {
            for (j = 0; j < table.length; j++) {
                System.out.print(table[i][j] + " ");

            }
            System.out.println(" ");
        }
    }
}
