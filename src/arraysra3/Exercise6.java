package arraysra3;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Marvin
 */
public class Exercise6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] num = new int[10];

        for (int i = 0; i < num.length; i++) {
            System.out.print("Introduce a number: ");
            num[i] = sc.nextInt();
        }
        System.out.println("=====================");

        System.out.println("The positions are:");
        for (int i = 0; i < num.length; i++) {
            System.out.println("Position " + i + ": " + num[i]);
        }

        System.out.println("=====================");

        System.out.print("Select a position to remove (0-4): ");
        int remove = sc.nextInt();

        System.out.println("=====================");
        if ((remove < 0) || (remove > num.length)) {
            System.out.println("Position non existant");
        }else{
            for (int j = remove; j < num.length-1;j++){
                num[j]=num[j+1]; //num[] al terminar el bucle se convierte en num.length(el maximo).
            }
            num[num.length-1]=0; //convertimos el ultimo valor en el array en 0 ya que es lo que nos pide el ejercicio
        }
        System.out.println("The new positions are:");
            for (int i = 0; i < num.length; i++) {
                System.out.println("Position "+i+":"+num[i]);
        }
            
    }

}


