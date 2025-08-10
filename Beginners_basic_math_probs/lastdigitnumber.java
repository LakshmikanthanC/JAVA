import java.util.*;
public class lastdigitnumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        int lastDigit = number % 10;
        System.out.println("The last digit of " + number + " is " + lastDigit);
    }
}


// Enter a number: 12345
// The last digit of 12345 is 5