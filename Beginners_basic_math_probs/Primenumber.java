import java.util.*;

public class Primenumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to check if it is prime: ");
        int num = sc.nextInt();
        boolean isPrime = true;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                isPrime = false;
                break;
            }
        }
        if (isPrime) {
            System.out.println(num + " is a prime number.");
        } else {
            System.out.println(num + " is not a prime number.");
        }
    }
}


// Enter a number to check if it is prime: 15
// 15 is not a prime number.

// Enter a number to check if it is prime: 11
// 11 is a prime number.