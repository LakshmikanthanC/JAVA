import java.util.*;

public class IntersectionArrays {
    public static void main(String[] args) {
        int arr1[] = {1, 2, 2, 3, 4};
        int arr2[] = {2, 2, 4, 6};

        HashMap<Integer, Integer> map = new HashMap<>();
        ArrayList<Integer> result = new ArrayList<>();

        // Count frequency of elements in arr1
        for (int num : arr1) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        // Check elements of arr2
        for (int num : arr2) {
            if (map.containsKey(num) && map.get(num) > 0) {
                result.add(num); // add common element
                map.put(num, map.get(num) - 1); // decrease count
            }
        }

        System.out.println("Intersection: " + result);
    }
}



// Intersection: [2, 2, 4]