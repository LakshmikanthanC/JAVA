import java.util.*;

public class Findcountoftriplets {
    public static void main(String[] args){
        int[] arr = {0, -1, 2, -3, 1};
        int count = countTriplets(arr);
        System.out.println("Count of triplets: " + count);
    }

    public static int countTriplets(int[] arr) {
        int count = 0;
        Arrays.sort(arr);
        for (int i = 0; i < arr.length - 2; i++) {
            if (i > 0 && arr[i] == arr[i - 1]) continue; // Skip duplicates
            int left = i + 1;
            int right = arr.length - 1;
            while (left < right) {
                int sum = arr[i] + arr[left] + arr[right];
                if (sum == 0) {
                    count++;
                    while (left < right && arr[left] == arr[left + 1]) left++; // Skip duplicates
                    while (left < right && arr[right] == arr[right - 1]) right--; // Skip duplicates
                    left++;
                    right--;
                } else if (sum < 0) {
                    left++;
                } else {
                    right--;
                }
            }
        }
        return count;
    }
}



// Count of triplets: 2