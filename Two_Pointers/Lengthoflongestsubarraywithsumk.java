import java.util.*;

public class Lengthoflongestsubarraywithsumk {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the value of k: ");
        int k = sc.nextInt();
        System.out.println("Length of longest subarray: " + longestSubarrayWithSumK(arr, k));
    }

    public static int longestSubarrayWithSumK(int[] arr, int k) {
        if (arr.length == 0) {
            return 0; // Return 0 for empty array
        }

        Map<Integer, Integer> map = new HashMap<>();
        int maxLength = 0;
        int currentSum = 0;

        for (int i = 0; i < arr.length; i++) {
            currentSum += arr[i];

            if (currentSum == k) {
                maxLength = i + 1;
            }

            if (map.containsKey(currentSum - k)) {
                maxLength = Math.max(maxLength, i - map.get(currentSum - k));
            }

            map.putIfAbsent(currentSum, i);
        }

        return maxLength > 0 ? maxLength : -1;
    }
}



// Enter the size of the array: 5
// Enter the elements of the array:
// 10
// 5
// 23
// 21
// 5
// Enter the value of k: 15
// Length of longest subarray: 2