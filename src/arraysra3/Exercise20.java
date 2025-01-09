package arraysra3;

import java.util.Scanner;

/**
 *
 * @author Marvin
 */
public class Exercise20 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] table = new int[7][7];
        int position = 0;
        table[0][0] = 1;
        for (int i = 0; i < table.length; i++) {
            for (int j = 1; j < table.length; j++) {
                table[i][j] = 0;
                position++;
                if (position == 7) {
                    table[i][j] = 1;
                    position = 0;
                }

            }
        }
        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table.length; j++) {
                System.out.print(table[i][j] + " ");
            }
            System.out.println(" ");
        }

    }
}
