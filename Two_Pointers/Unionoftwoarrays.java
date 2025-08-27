import java.util.*;

public class Unionoftwoarrays {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {4, 5, 6, 7, 8};
        List<Integer> union = findUnion(arr1, arr2);
        System.out.println("Union of two arrays: " + union);
    }

    public static List<Integer> findUnion(int[] arr1, int[] arr2) {
        Set<Integer> set = new HashSet<>();
        for (int num : arr1) {
            set.add(num);
        }
        for (int num : arr2) {
            set.add(num);
        }
        return new ArrayList<>(set);
    }
}


// Union of two arrays: [1, 2, 3, 4, 5, 6, 7, 8]