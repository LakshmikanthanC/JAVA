import java.util.*;

public class palindromenumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n= sc.nextInt();
        int o=n;
        int rev=0;
        while(n>0) {
            int r=n%10;
            rev=(rev*10)+r;
            n=n/10;
        }
        if(rev==o) {
            System.out.println(o + " is a palindrome number.");
        } else {
            System.out.println(o + " is not a palindrome number.");
        }
    }
}


// Enter a number:
// 121
// 121 is a palindrome number.

// Enter a number:
// 123
// 123 is not a palindrome number.