import java.util.*;

public class pro3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int k=sc.nextInt();
        int T=sc.nextInt();
        int m=0;
        m^=(1<<(k-1));
        m^=(1<<(T-1));  
        if((N&(m))==m){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}


// 5
// 5
// 5
// YES