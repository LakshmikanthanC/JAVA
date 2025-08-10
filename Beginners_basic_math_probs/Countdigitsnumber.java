import java.util.*;
public class Countdigitsnumber {
    public static void main(String[] args){
        System.out.print("Enter a number: ");
        Scanner scanner = new Scanner(System.in);
        int n  = scanner.nextInt();
        // int n = 12345;
        int count = 0;

        while (n != 0) {
            n /= 10;
            count++;
        }

        System.out.println("Number of digits: " + count);
    }
}

// Enter a number: 12345
// Number of digits: 5