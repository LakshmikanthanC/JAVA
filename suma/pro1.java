import java.util.*;
public class pro1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            if((arr[i] &(1<<k-1))!=0){
                System.out.println("yes");
            }
            else{
                System.out.println("no");
            }
        }
        
    }
}
