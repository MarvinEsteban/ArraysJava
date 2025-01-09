package arraysra3;

import java.util.Random;

/**
 *
 * @author Marvin
 */
public class Exercise21 {

    public static void main(String[] args) {
        char[][] table = new char[4][5];
        char[] vowels = {'A', 'E', 'I', 'O', 'U'};
        Random vowelsR = new Random();

        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table[i].length; j++) {
                int randomVowels = vowelsR.nextInt(vowels.length);
                char randomVowel = vowels[randomVowels];
                table[i][j] = randomVowel;

            }
        }
        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table[i].length; j++) {
                System.out.print(table[i][j]+" ");
                
            }
            System.out.println(" ");
        }
    }

}
