package arraysra3;

import java.util.Scanner;

/**
 *
 * @author Marvin
 */
public class Exercise18 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int j, i;
        int[][] table = new int[4][4];
        boolean symmetrical = true;

        for (i = 0; i < table.length; i++) {
            for (j = 0; j < table.length; j++) {
                System.out.print("Introduce a number: ");
                table[i][j] = sc.nextInt();

            }
        }
        for (i = 0; i < table.length; i++) {
            for (j = 0; j < table.length; j++) {
                System.out.print(table[i][j] + " ");

            }
            System.out.println(" ");
        }
        for (i = 0; i < table.length; i++) {
            for (j = 0; j < table.length; j++) {
                if (table[i][j] != table[j][i]) {
                    symmetrical = false;
                    break;
                } else {
                    symmetrical = true;
                }
            }

        }
        if (symmetrical == true) {
            System.out.println("Its a symmetrical table.");
        } else if (symmetrical == false) {
            System.out.println("Its an asymmetrical table.");
        }
    }
}
