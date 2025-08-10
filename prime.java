import java.util.Scanner;

public class PrimeCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if (isPrime(num)) {
            System.out.println(num + " is a prime number.");
        } else {
            System.out.println(num + " is not a prime number.");
        }

        sc.close();
    }

    public static boolean isPrime(int n) {
        if (n <= 1) return false; // 0, 1 and negatives are not prime
        if (n == 2) return true;  // 2 is prime
        if (n % 2 == 0) return false; // Even numbers > 2 are not prime

        for (int i = 3; i <= Math.sqrt(n); i += 2) {
            if (n % i == 0) return false;
        }
        return true;
    }
}
