package arraysra3;

import java.util.Scanner;

/**
 *
 * @author Marvin
 */
public class Exercise8 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i, j, k;
        int[] nums1 = new int[10];
        int[] nums2 = new int[10];
        int[] nums3 = new int[20];
        for (i = 0; i < nums1.length; i++) {
            System.out.print("Introduce a number for nums1: ");
            nums1[i] = sc.nextInt();
        }
        System.out.println("====================");
        for (i = 0; i < nums2.length; i++) {
            System.out.print("Introduce a number for nums2: ");
            nums2[i] = sc.nextInt();
        }
        System.out.println("====================");
        j = 0;
        k = 0;
        for (i = 0; i < nums1.length; i++) {
            nums3[k++] = nums1[i];
            nums3[k++] = nums2[i];
            
        }
        for (i = 0; i < nums3.length; i++) {
            System.out.println("Position " + i + ": " + nums3[i]);
        }

    }
}
