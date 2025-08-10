import java.util.*;


public class squareroot {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter a number:");
            double n = sc.nextDouble();
            double sqrt = Math.sqrt(n);
            System.out.printf("The square root of %.2f is %.2f%n", n, sqrt);
        }
    }
}

// Enter a number:
// 16
// The square root of 16.00 is 4.00