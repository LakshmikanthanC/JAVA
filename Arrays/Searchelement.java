import java.util.*;

public class Searchelement {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter element to search: ");
        int s = sc.nextInt();
        
        boolean flag = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == s) {
                System.out.println("Element found at index: " + i);
                flag = true;
                break;
            }
        }
        
        if (!flag) {
            System.out.println("Element not found");
        }
        
        sc.close();
    }
}

// Enter element to search: 40
// Element found at index: 3