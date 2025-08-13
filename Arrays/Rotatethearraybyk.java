import java.util.*;

public class Rotatethearraybyk {
    
    // Method to rotate array right by k positions
    public static void rotateRight(int[] arr, int k) {
        int n = arr.length;
        if (n == 0 || k % n == 0) return;
        
        k = k % n; // Handle cases where k > n
        
        // Reverse the entire array
        reverse(arr, 0, n - 1);
        // Reverse first k elements
        reverse(arr, 0, k - 1);
        // Reverse remaining elements
        reverse(arr, k, n - 1);
    }
    
    // Method to rotate array left by k positions
    public static void rotateLeft(int[] arr, int k) {
        int n = arr.length;
        if (n == 0 || k % n == 0) return;
        
        k = k % n; // Handle cases where k > n
        
        // Reverse first k elements
        reverse(arr, 0, k - 1);
        // Reverse remaining elements
        reverse(arr, k, n - 1);
        // Reverse the entire array
        reverse(arr, 0, n - 1);
    }
    
    // Helper method to reverse elements in array
    private static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    
    // Method to print array
    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input array size
        System.out.print("Enter the size of array: ");
        int n = scanner.nextInt();
        
        // Input array elements
        int[] arr = new int[n];
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        
        // Input rotation value
        System.out.print("Enter rotation value (k): ");
        int k = scanner.nextInt();
        
        // Input rotation direction
        System.out.print("Enter rotation direction (left/right): ");
        String direction = scanner.next().toLowerCase();
        
        System.out.println("Original array:");
        printArray(arr);
        
        // Perform rotation based on direction
        if (direction.equals("left")) {
            rotateLeft(arr, k);
            System.out.println("Array after left rotation by " + k + " positions:");
        } else if (direction.equals("right")) {
            rotateRight(arr, k);
            System.out.println("Array after right rotation by " + k + " positions:");
        } else {
            System.out.println("Invalid direction! Using right rotation by default.");
            rotateRight(arr, k);
            System.out.println("Array after right rotation by " + k + " positions:");
        }
        
        printArray(arr);
        
        scanner.close();
    }
}
