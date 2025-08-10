import java.util.*;

class OddOrEven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("=== Odd or Even Number Checker ===");
        System.out.print("Enter how many numbers you want to check: ");
        int count = scanner.nextInt();
        
        for (int i = 1; i <= count; i++) {
            System.out.print("Enter number " + i + ": ");
            int number = scanner.nextInt();
            
            if (number % 2 == 0) {
                System.out.println(number + " is even.");
            } else {
                System.out.println(number + " is odd.");
            }
        }
        
        // System.out.println("\nThank you for using the checker!");
        scanner.close();
    }
}

// === Odd or Even Number Checker ===
// Enter how many numbers you want to check: 2
// Enter number 1: 1
// 1 is odd.
// Enter number 2: 2
// 2 is even.
