import java.util.*;

public class FourSum {
    
    // Method to find all unique quadruplets that sum to target using two pointers
    public static List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> result = new ArrayList<>();
        
        if (nums == null || nums.length < 4) {
            return result;
        }
        
        Arrays.sort(nums);
        int n = nums.length;
        
        for (int i = 0; i < n - 3; i++) {
            // Skip duplicates for the first number
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            
            for (int j = i + 1; j < n - 2; j++) {
                // Skip duplicates for the second number
                if (j > i + 1 && nums[j] == nums[j - 1]) {
                    continue;
                }
                
                int left = j + 1;
                int right = n - 1;
                
                while (left < right) {
                    long sum = (long) nums[i] + nums[j] + nums[left] + nums[right];
                    
                    if (sum == target) {
                        result.add(Arrays.asList(nums[i], nums[j], nums[left], nums[right]));
                        
                        // Skip duplicates for the third number
                        while (left < right && nums[left] == nums[left + 1]) {
                            left++;
                        }
                        // Skip duplicates for the fourth number
                        while (left < right && nums[right] == nums[right - 1]) {
                            right--;
                        }
                        
                        left++;
                        right--;
                    } else if (sum < target) {
                        left++;
                    } else {
                        right--;
                    }
                }
            }
        }
        
        return result;
    }
    
    // Method to find all unique quadruplets that sum to target (alternative approach)
    public static List<List<Integer>> fourSumHashSet(int[] nums, int target) {
        List<List<Integer>> result = new ArrayList<>();
        
        if (nums == null || nums.length < 4) {
            return result;
        }
        
        Arrays.sort(nums);
        int n = nums.length;
        Set<String> seen = new HashSet<>();
        
        for (int i = 0; i < n - 3; i++) {
            for (int j = i + 1; j < n - 2; j++) {
                int left = j + 1;
                int right = n - 1;
                
                while (left < right) {
                    long sum = (long) nums[i] + nums[j] + nums[left] + nums[right];
                    
                    if (sum == target) {
                        String key = nums[i] + "," + nums[j] + "," + nums[left] + "," + nums[right];
                        
                        if (!seen.contains(key)) {
                            result.add(Arrays.asList(nums[i], nums[j], nums[left], nums[right]));
                            seen.add(key);
                        }
                        
                        left++;
                        right--;
                    } else if (sum < target) {
                        left++;
                    } else {
                        right--;
                    }
                }
            }
        }
        
        return result;
    }
    
    // Method to print quadruplets in a readable format
    public static void printQuadruplets(List<List<Integer>> quadruplets) {
        if (quadruplets.isEmpty()) {
            System.out.println("No quadruplets found");
            return;
        }
        
        System.out.println("Quadruplets found:");
        for (List<Integer> quad : quadruplets) {
            System.out.println(quad.get(0) + " + " + quad.get(1) + " + " + 
                              quad.get(2) + " + " + quad.get(3) + " = " + 
                              (quad.get(0) + quad.get(1) + quad.get(2) + quad.get(3)));
        }
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Test cases
        int[] nums1 = {1, 0, -1, 0, -2, 2};
        int target1 = 0;
        
        int[] nums2 = {2, 2, 2, 2, 2};
        int target2 = 8;
        
        int[] nums3 = {1000000000, 1000000000, 1000000000, 1000000000};
        int target3 = -294967296;
        
        System.out.println("Test Case 1:");
        System.out.println("Array: " + Arrays.toString(nums1));
        System.out.println("Target: " + target1);
        
        List<List<Integer>> result1 = fourSum(nums1, target1);
        printQuadruplets(result1);
        
        System.out.println("\nTest Case 2:");
        System.out.println("Array: " + Arrays.toString(nums2));
        System.out.println("Target: " + target2);
        
        List<List<Integer>> result2 = fourSum(nums2, target2);
        printQuadruplets(result2);
        
        System.out.println("\nTest Case 3 (Edge case with large numbers):");
        System.out.println("Array: " + Arrays.toString(nums3));
        System.out.println("Target: " + target3);
        
        List<List<Integer>> result3 = fourSum(nums3, target3);
        printQuadruplets(result3);
        
        // Interactive mode
        System.out.println("\n--- Interactive Mode ---");
        System.out.print("Enter array size: ");
        int size = scanner.nextInt();
        
        int[] userNums = new int[size];
        System.out.print("Enter " + size + " elements: ");
        for (int i = 0; i < size; i++) {
            userNums[i] = scanner.nextInt();
        }
        
        System.out.print("Enter target sum: ");
        int userTarget = scanner.nextInt();
        
        System.out.println("\nUsing Two Pointers approach:");
        List<List<Integer>> userResult = fourSum(userNums, userTarget);
        printQuadruplets(userResult);
        
        System.out.println("\nUsing HashSet approach:");
        List<List<Integer>> userResultHash = fourSumHashSet(userNums, userTarget);
        printQuadruplets(userResultHash);
        
        scanner.close();
    }
}



// Test Case 1:
// Array: [1, 0, -1, 0, -2, 2]
// Target: 0
// Quadruplets found:
// -2 + -1 + 1 + 2 = 0
// -2 + 0 + 0 + 2 = 0
// -1 + 0 + 0 + 1 = 0

// Test Case 2:
// Array: [2, 2, 2, 2, 2]
// Target: 8
// Quadruplets found:
// 2 + 2 + 2 + 2 = 8

// Test Case 3 (Edge case with large numbers):
// Array: [1000000000, 1000000000, 1000000000, 1000000000]
// Target: -294967296
// No quadruplets found

// --- Interactive Mode ---
// Enter array size: 5
// Enter 5 elements: 1
// 2
// 3
// 4
// 5
// Enter target sum: 12

// Using Two Pointers approach:
// Quadruplets found:
// 2 + 2 + 2 + 2 = 8

// Test Case 3 (Edge case with large numbers):
// Array: [1000000000, 1000000000, 1000000000, 1000000000]
// Target: -294967296
// No quadruplets found

// --- Interactive Mode ---
// Enter array size: 5
// Enter 5 elements: 1
// 2
// 3
// 4
// 5
// Enter target sum: 12

// Using Two Pointers approach:
// Array: [1000000000, 1000000000, 1000000000, 1000000000]
// Target: -294967296
// No quadruplets found

// --- Interactive Mode ---
// Enter array size: 5
// Enter 5 elements: 1
// 2
// 3
// 4
// 5
// Enter target sum: 12

// Using Two Pointers approach:
// Target: -294967296
// No quadruplets found

// --- Interactive Mode ---
// Enter array size: 5
// Enter 5 elements: 1
// 2
// 3
// 4
// 5
// Enter target sum: 12

// Using Two Pointers approach:
// No quadruplets found

// --- Interactive Mode ---
// Enter array size: 5
// Enter 5 elements: 1
// 2
// 3
// 4
// 5
// Enter target sum: 12

// Using Two Pointers approach:
// --- Interactive Mode ---
// Enter array size: 5
// Enter 5 elements: 1
// 2
// 3
// 4
// 5
// Enter target sum: 12

// Using Two Pointers approach:
// 2
// 3
// 4
// 5
// Enter target sum: 12

// Using Two Pointers approach:
// Quadruplets found:
// 1 + 2 + 4 + 5 = 12

// Using HashSet approach:
// Quadruplets found:
// 5
// Enter target sum: 12

// Using Two Pointers approach:
// Quadruplets found:
// 1 + 2 + 4 + 5 = 12

// Using HashSet approach:
// Quadruplets found:
// Quadruplets found:
// 1 + 2 + 4 + 5 = 12

// Using HashSet approach:
// Quadruplets found:
// 1 + 2 + 4 + 5 = 12