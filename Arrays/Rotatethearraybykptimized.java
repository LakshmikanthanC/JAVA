import java.util.*;

public class Rotatethearraybykptimized {
    
    // Juggling algorithm for rotation - O(n) time, O(1) space
    public static void rotate(int[] arr, int k, boolean right) {
        int n = arr.length;
        if (n == 0 || k % n == 0) return;
        
        k = k % n;
        if (!right) {
            k = n - k; // Convert left rotation to right rotation
        }
        
        int gcd = gcd(k, n);
        
        for (int i = 0; i < gcd; i++) {
            int temp = arr[i];
            int j = i;
            
            while (true) {
                int next = (j + k) % n;
                if (next == i) break;
                
                arr[j] = arr[next];
                j = next;
            }
            arr[j] = temp;
        }
    }
    
    // Helper method to calculate GCD
    private static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
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
        
        // Test case 1
        int[] arr1 = {1, 2, 3, 4, 5, 6, 7};
        int k1 = 3;
        
        System.out.println("Test Case 1:");
        System.out.println("Original array: ");
        printArray(arr1);
        
        rotate(arr1, k1, true);
        System.out.println("After right rotation by " + k1 + ":");
        printArray(arr1);
        
        // Test case 2 - left rotation
        int[] arr2 = {1, 2, 3, 4, 5};
        int k2 = 2;
        
        System.out.println("\nTest Case 2:");
        System.out.println("Original array: ");
        printArray(arr2);
        
        rotate(arr2, k2, false);
        System.out.println("After left rotation by " + k2 + ":");
        printArray(arr2);
        
        scanner.close();
    }
}
