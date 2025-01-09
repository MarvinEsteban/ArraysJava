package arraysra3;

import java.util.Scanner;

/**
 *
 * @author Marvin
 */
public class Exercise9 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i, j, k;
        int[] nums1 = new int[12];
        int[] nums2 = new int[12];
        int[] nums3 = new int[24];
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
        
        k = 0;
        for (i = 0; i < nums1.length; i+=3) {
            for ( j = 0;  j< 3; j++) {
            nums3[k++] = nums1[i+j];
                
            }for (j = 0; j < 3; j++) {
            nums3[k++] = nums2[i+j];
                
            }
            
        }
        for (i = 0; i < nums3.length; i++) {
            System.out.println("Position " + i + ": " + nums3[i]);
        }

    }
}
