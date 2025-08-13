import java.util.*;
public class pro2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        if((n&(n-1))==0){
            System.out.println("yes");
        }else{
            System.out.println("no");
        }
    }
