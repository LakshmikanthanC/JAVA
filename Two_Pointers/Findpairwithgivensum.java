import java.util.*;

public class Findpairwithgivensum {
    
    // Method to find pair with given sum using two pointers
    public static boolean findPair(int[] arr, int targetSum) {
        // Handle edge cases
        if (arr == null || arr.length < 2) {
            return false;
        }
        
        // Create a copy of array and sort it
        int[] sortedArr = Arrays.copyOf(arr, arr.length);
        Arrays.sort(sortedArr);
        
        int left = 0;
        int right = sortedArr.length - 1;
        while (left < right) {
            int currentSum = sortedArr[left] + sortedArr[right];
            
            if (currentSum == targetSum) {
                System.out.println("Pair found: " + sortedArr[left] + " + " + sortedArr[right] + " = " + targetSum);
                return true;
            } else if (currentSum < targetSum) {
                left++; // Need larger sum, move left pointer right
            } else {
                right--; // Need smaller sum, move right pointer left
            }
        }
        
        return false;
    }
    
    public static boolean findPairHashSet(int[] arr, int targetSum) {
        if (arr == null || arr.length < 2) {
            return false;
        }
        
        Set<Integer> seen = new HashSet<>();
        
        for (int num : arr) {
            int complement = targetSum - num;
            if (seen.contains(complement)) {
                System.out.println("Pair found: " + num + " + " + complement + " = " + targetSum);
                return true;
            }
            seen.add(num);
        }
        
        return false;
    }
    
    public static int[] getPair(int[] arr, int targetSum) {
        if (arr == null || arr.length < 2) {
            return new int[]{};
        }
        
        int[] sortedArr = Arrays.copyOf(arr, arr.length);
        Arrays.sort(sortedArr);
        
        int left = 0;
        int right = sortedArr.length - 1;
        
        while (left < right) {
            int currentSum = sortedArr[left] + sortedArr[right];
            
            if (currentSum == targetSum) {
                return new int[]{sortedArr[left], sortedArr[right]};
            } else if (currentSum < targetSum) {
                left++;
            } else {
                right--;
            }
        }
        
        return new int[]{};
    }
    
    public static List<int[]> findAllPairs(int[] arr, int targetSum) {
        List<int[]> pairs = new ArrayList<>();
        
        if (arr == null || arr.length < 2) {
            return pairs;
        }
        
        int[] sortedArr = Arrays.copyOf(arr, arr.length);
        Arrays.sort(sortedArr);
        
        int left = 0;
        int right = sortedArr.length - 1;
        
        while (left < right) {
            int currentSum = sortedArr[left] + sortedArr[right];
            
            if (currentSum == targetSum) {
                pairs.add(new int[]{sortedArr[left], sortedArr[right]});
                
                while (left < right && sortedArr[left] == sortedArr[left + 1]) {
                    left++;
                }
                while (left < right && sortedArr[right] == sortedArr[right - 1]) {
                    right--;
                }
                
                left++;
                right--;
            } else if (currentSum < targetSum) {
                left++;
            } else {
                right--;
            }
        }
        
        return pairs;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int[] arr1 = {1, 4, 45, 6, 10, 8};
        int target1 = 16;
        
        System.out.println("Array: " + Arrays.toString(arr1));
        System.out.println("Target sum: " + target1);
        
        System.out.println("\nUsing Two Pointers:");
        boolean found1 = findPair(arr1, target1);
        if (!found1) {
            System.out.println("No pair found with sum " + target1);
        }
        
        System.out.println("\nUsing HashSet:");
        boolean found2 = findPairHashSet(arr1, target1);
        if (!found2) {
            System.out.println("No pair found with sum " + target1);
        }
        
        int[] pair = getPair(arr1, target1);
        if (pair.length > 0) {
            System.out.println("\nActual pair: " + Arrays.toString(pair));
        }
        
        int[] arr2 = {1, 5, 7, -1, 5};
        int target2 = 6;
        List<int[]> allPairs = findAllPairs(arr2, target2);
        
        System.out.println("\n\nArray: " + Arrays.toString(arr2));
        System.out.println("Target sum: " + target2);
        System.out.println("All pairs with sum " + target2 + ":");
        
        for (int[] p : allPairs) {
            System.out.println(Arrays.toString(p));
        }
        
        // Interactive mode
        System.out.println("\n\n--- Interactive Mode ---");
        System.out.print("Enter array size: ");
        int size = scanner.nextInt();
        
        int[] userArr = new int[size];
        System.out.print("Enter " + size + " elements: ");
        for (int i = 0; i < size; i++) {
            userArr[i] = scanner.nextInt();
        }
        
        System.out.print("Enter target sum: ");
        int target = scanner.nextInt();
        
        System.out.println("\nResults:");
        boolean found = findPair(userArr, target);
        if (!found) {
            System.out.println("No pair found with sum " + target);
        }
        
        int[] userPair = getPair(userArr, target);
        if (userPair.length > 0) {
            System.out.println("Pair: " + Arrays.toString(userPair));
        }
        
        scanner.close();
    }
}


// Array: [1, 4, 45, 6, 10, 8]
// Target sum: 16

// Using Two Pointers:
// Pair found: 6 + 10 = 16

// Using HashSet:
// Pair found: 10 + 6 = 16

// Actual pair: [6, 10]


// Array: [1, 5, 7, -1, 5]
// Target sum: 6
// All pairs with sum 6:
// [-1, 7]
// [1, 5]


// --- Interactive Mode ---
// Enter array size: 5
// Enter 5 elements: 1
// 2
// 3
// 6
// 5
// Enter target sum: 6

// Results:
// Pair found: 1 + 5 = 6
// Pair: [1, 5]