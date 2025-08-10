import java.util.*;
public class Reversenumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to reverse: ");
        int n=sc.nextInt();
        int r = 0;
        while (n != 0) {
            int digit = n % 10;
            r = r * 10 + digit;
            n /= 10;
        }
        System.out.println("Reversed number: " + r);
    }
}


// Enter a number to reverse: 
// 1564
// Reversed number: 4651