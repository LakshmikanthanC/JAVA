import java.util.*;
public class pro7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int row=sc.nextInt();
        System.out.println(a + b);
        int maxLen;
        String s1,s2;
        for(int col=1;col<=c;col++){
            if(s1.charAt(row-1) == s2.charAt(col-1)){
                dp[row][col] = dp[row-1][col-1]+1;
                maxLen = Math.max(maxLen, dp[row][col]);
            }
        }
        for(int row=1;row<=R;row++){
            for(int col =1;col<=C;col++){
                if(dp[row][col]==maxLen){
                    System.out.println(s1.substring(row-maxLen,row));
                }
            }
        }
    }   
}
