import java.util.*;

public class Threesum {
    public static void  main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n = sc.nextInt();
        int[] nums = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        int fe = nums[0];
        int se = nums[1];
        for (int i = 2; i < n; i++) {
            int th = nums[i];
            if (fe + se + th == 0) {
                System.out.println("Triplet found: " + fe + ", " + se + ", " + th);
            }
        }
    }
}



// Enter the size of the array:
// 4
// Enter the elements of the array:
// 2
// -1
// -1
// 4
// Triplet found: 2, -1, -1