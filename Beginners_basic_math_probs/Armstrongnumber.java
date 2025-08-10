import java.util.*;

public class Armstrongnumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n= sc.nextInt();
        int o=n;
        int sum=0;
        while(n>0) {
            int r=n%10;
            sum=sum+(r*r*r);
            n=n/10;
        }
        if(sum==o) {
            System.out.println(o + " is an Armstrong number.");
        } else {
            System.out.println(o + " is not an Armstrong number.");
        }
    }
}

// Enter a number:
// 153
// 153 is an Armstrong number.

// Enter a number:
// 151
// 151 is not an Armstrong number.