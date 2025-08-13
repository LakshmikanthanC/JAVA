import java.util.*;

public class Rotatethearraybyk_simple {
    
    // Simple rotation using extra space - O(n) time, O(n) space
    public static int[] rotateRight(int[] arr, int k) {
        int n = arr.length;
        if (n == 0 || k % n == 0) return arr.clone();
        
        k = k % n;
        int[] result = new int[n];
        
        // Copy last k elements to front
        for (int i = 0; i < k; i++) {
            result[i] = arr[n - k + i];
        }
        
        // Copy remaining elements
        for (int i = k; i < n; i++) {
            result[i] = arr[i - k];
        }
        
        return result;
    }
    
    // Simple rotation using extra space - O(n) time, O(n) space
    public static int[] rotateLeft(int[] arr, int k) {
        int n = arr.length;
        if (n == 0 || k % n == 0) return arr.clone();
        
        k = k % n;
        int[] result = new int[n];
        
        // Copy from index k to end to front
        for (int i = 0; i < n - k; i++) {
            result[i] = arr[k + i];
        }
        
        // Copy first k elements to end
        for (int i = n - k; i < n; i++) {
            result[i] = arr[i - (n - k)];
        }
        
        return result;
    }
    
    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Example usage
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int k = 4;
        
        System.out.println("Original array:");
        printArray(arr);
        
        int[] rotatedRight = rotateRight(arr, k);
        System.out.println("After right rotation by " + k + ":");
        printArray(rotatedRight);
        
        int[] rotatedLeft = rotateLeft(arr, k);
        System.out.println("After left rotation by " + k + ":");
        printArray(rotatedLeft);
        
        scanner.close();
    }
}
