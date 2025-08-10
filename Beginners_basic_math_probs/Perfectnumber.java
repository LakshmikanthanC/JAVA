import java.util.Scanner;
public class Perfectnumber {
    public static boolean isPerfect(int n) {
        int sum = 0;
        for (int i = 1; i <= n / 2; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }
        return sum == n;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            System.out.println("Enter a number:");
            int n = sc.nextInt();
            if (isPerfect(n)) {
                System.out.println(n + " is a perfect number.");
            } else {
                System.out.println(n + " is not a perfect number.");
            }
        }
    }

// Enter a number:
// 6
// 6 is a perfect number.

// Enter a number:
// 9
// 9 is not a perfect number.