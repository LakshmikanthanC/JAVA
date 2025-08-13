import java.util.*;

public class pro8 {
    
    
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
    
    public static int[] rotateLeft(int[] arr, int k) {
        int n = arr.length;
        if (n == 0 || k % n == 0)
         return arr.clone();
        
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
    
    // Method to get array size
    public static int getArraySize(int[] arr) {
        return arr.length;
    }
    
    // Method to create array from user input
    public static int[] createArrayFromInput(Scanner scanner) {
        System.out.print("Enter the size of array: ");
        int size = scanner.nextInt();
        
        int[] arr = new int[size];
        System.out.println("Enter " + size + " array elements:");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }
        
        return arr;
    }
    
    public static void printArray(int[] arr) {
        System.out.print("Array: [");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) System.out.print(", ");
        }
        System.out.println("]");
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        
        int[] arr = createArrayFromInput(scanner);
        
        
        int arraySize = getArraySize(arr);
        System.out.println("Array size: " + arraySize);
        
        
        System.out.println("Original array:");
        printArray(arr);
        
        System.out.print("Enter rotation value (k): ");
        int k = scanner.nextInt();
        
        System.out.print("Enter rotation direction (left/right): ");
        String direction = scanner.next().toLowerCase();
        
        
        int[] rotatedArray;
        if (direction.equals("left")) {
            rotatedArray = rotateLeft(arr, k);
            System.out.println("Array after left rotation by " + k + " positions:");
        } else if (direction.equals("right")) {
            rotatedArray = rotateRight(arr, k);
            System.out.println("Array after right rotation by " + k + " positions:");
        } else {
            System.out.println("Invalid direction! Using right rotation by default.");
            rotatedArray = rotateRight(arr, k);
            System.out.println("Array after right rotation by " + k + " positions:");
        }
        
        printArray(rotatedArray);
        System.out.println("Rotated array size: " + getArraySize(rotatedArray));
        
        scanner.close();
    }
}
