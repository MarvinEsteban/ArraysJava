package arraysra3;

import java.util.Scanner;

/**
 *
 * @author Marvin
 */
public class Exercise6_2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] num = new int[10];
        int number;
        int i, j;
        int position;
        for (i = 0; i < 5; i++) {        //seleccion de numero con "number"; seleccion de posicion con "position";
            System.out.println(" ");
            System.out.print("Introduce a number: ");
            number = sc.nextInt();
            System.out.print("Introduce a position: ");
            position = sc.nextInt();
            if (position >= 0 && position < num.length) {  //si position esta entre 0 y array, realizar el if; 
                num[position] = number;                   //en este if asignas al array con la posicion solicitada anteriormente el numero;                  

                for (int k = 0; k < num.length; k++) {  //mostramos el array en horizontal 
                    System.out.print(num[k] + " ");
                }

            }
            /*else {

                System.out.print("Introduce a correct position!: ");
                int position2 = sc.nextInt();
                if (position >= 0 && position < num.length) {  //si position esta entre 0 y array, realizar el if; 
                    num[position2] = number;                   //en este if asignas al array con la posicion solicitada anteriormente el numero;
                    for (j = 0; j < num.length; j++) {  //mostramos el array en horizontal 
                        System.out.print(num[j] + " ");
                    }*/
        }
    }
}


