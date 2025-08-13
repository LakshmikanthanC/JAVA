import java.util.*;

public class third_largest_array {
    public static void main(String[] args) {
        int[] arr = {3, 5, 1, 8, 2};
        int thirdLargest = findThirdLargest(arr);
        System.out.println("Third Largest: " + thirdLargest);
    }

    public static int findThirdLargest(int[] array) {
        Arrays.sort(array);
        return array[array.length - 3];
    }
}


// Third Largest: 3
