import java.util.*;

public class repeatingnumberarray {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50, 30, 10};
        Set<Integer> seen = new HashSet<>();
        Set<Integer> repeated = new HashSet<>();
        
        for (int num : arr) {
            if (!seen.add(num)) {
                repeated.add(num);
            }
        }
        
        if (repeated.isEmpty()) {
            System.out.println("No repeating elements found.");
        } else {
            System.out.println("Repeating elements: " + repeated);
        }
    }
}

// Repeating elements: [10, 30]