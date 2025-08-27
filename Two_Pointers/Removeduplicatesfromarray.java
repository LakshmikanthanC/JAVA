import java.util.*;

public class RemoveDuplicatesfromarray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 4, 4, 5};
        int n = arr.length;

        int[] temp = new int[n];
        int j = 0;

        for (int i = 0; i < n - 1; i++) {
            if (arr[i] != arr[i + 1]) {
                temp[j++] = arr[i];
            }
        }
        temp[j++] = arr[n - 1];  // last element always included

        // Print result
        for (int k = 0; k < j; k++) {
            System.out.print(temp[k] + " ");
        }
    }
}



// 1 2 3 4 5 