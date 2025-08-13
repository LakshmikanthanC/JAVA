import java.util.*;

public class minmaxarray {
    public static void main(String[] args) {
        int[] arr = {3, 5, 1, 8, 2};
        int min = findMin(arr);
        int max = findMax(arr);
        System.out.println("Minimum: " + min);
        System.out.println("Maximum: " + max);
    }

    public static int findMin(int[] array) {
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }

    public static int findMax(int[] array) {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }
}


// Minimum: 1
// Maximum: 8