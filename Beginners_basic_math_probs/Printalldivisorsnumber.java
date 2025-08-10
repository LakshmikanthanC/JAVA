import java.util.*;

public class Printalldivisorsnumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to find its divisors:");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            if(n%i==0){
                System.out.print(i+ " ");
            }
        }
    }
}


// Enter a number to find its divisors:
// 10
// 1 2 5 10