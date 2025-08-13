import java.util.*;

public class pro10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read input string
        String input = scanner.nextLine();
        
        // Check if the input is a palindrome
        boolean isPalindrome = isPalindrome(input);
        
        // Generate all possible rotations of the string
        List<String> rotations = generateRotations(input);
        
        // Print results
        System.out.println("Input: " + input);
        System.out.println("Is palindrome: " + isPalindrome);
        System.out.println("All rotations:");
        
        for (String rotation : rotations) {
            System.out.println(rotation);
        }
        
        scanner.close();
    }
    
    // Method to check if a string is palindrome
    public static boolean isPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;
        
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    
    // Method to generate all rotations of a string
    public static List<String> generateRotations(String str) {
        List<String> rotations = new ArrayList<>();
        int n = str.length();
        
        for (int i = 0; i < n; i++) {
            String rotation = str.substring(i) + str.substring(0, i);
            rotations.add(rotation);
        }
        
        return rotations;
    }
}
