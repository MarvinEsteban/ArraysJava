package arraysra3;

import java.util.Scanner;

/**
 *
 * @author Marvin
 */
public class Exercise19 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m, n, k, l, j, i;
        int[][] table1 = new int[3][3];
        int[][] table2 = new int[3][3];
        int[][] sumTable = new int[3][3];
        for (i = 0; i < table1.length; i++) {       //table1
            for (j = 0; j < table1.length; j++) {
                System.out.print("Introduce a number for table1: ");
                table1[i][j] = sc.nextInt();
            }
        }
        for (k = 0; k < table2.length; k++) {      //table2
            for (l = 0; l < table2.length; l++) {
                System.out.print("Introduce a number for table2: ");
                table2[k][l] = sc.nextInt();
            }
        }
        for (i = 0; i < table1.length; i++) {       //table1
            for (j = 0; j < table1.length; j++) {
                System.out.print(table1[i][j] + " ");
            }
            System.out.println(" ");
        }
        i = 0;
        j = 0;

        for (k = 0; k < table2.length; k++) {      //table2
            for (l = 0; l < table2.length; l++) {
                System.out.print(table2[k][l] + " ");
            }
            System.out.println(" ");
        }
        k = 0;
        l = 0;
        for (m = 0; m < sumTable.length; m++) {                 //suma

            for (n = 0; n < sumTable.length; n++) {
                sumTable[m][n] = table1[m][n] + table2[m][n];

            }
        }
        for (m = 0; m < sumTable.length; m++) {
            for (n = 0; n < sumTable.length; n++) {
                System.out.print(sumTable[m][n] + " ");
            }
            System.out.println(" ");
        }

    }
}
