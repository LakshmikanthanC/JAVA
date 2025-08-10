import java.util.*;

public class GCD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the First number:");
        int a = sc.nextInt();
        System.out.println("Enter the Second number:");
        int b = sc.nextInt();  
        int gcd = findGCD(a, b);
        System.out.println("GCD of " + a + " and " + b + " is: " + gcd);
    }

    public static int findGCD(int x, int y) {
        if (y == 0) {
            return x;
        }
        return findGCD(y, x % y);
    }
}

// Enter the First number:
// 5
// Enter the Second number:
// 3
// GCD of 5 and 3 is: 1
