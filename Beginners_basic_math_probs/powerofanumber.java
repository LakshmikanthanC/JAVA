import java.util.*;

public class powerofanumber {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the base number:");
        int n=s.nextInt();
        System.out.println("Enter the exponent:");
        int p=s.nextInt();
        int result=1;
        result=(int)Math.pow(n,p);
        int i=1;
        i=(int)Math.pow(p,n);
        System.out.println("Result of n^p: "+result);
        System.out.println("Result of p^n: "+i);
    }

}


// Enter the base number:

// 5
// Enter the exponent:
// 3
// Result of n^p: 125
// Result of p^n: 243