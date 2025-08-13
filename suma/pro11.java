import java.util.*;
public class pro11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str=sc.nextLine();
        int flag=0;
        for(char ch:str.toCharArray()){
            flag=flag^(1<<(ch-'a'));
        }
        if(flag==0||flag(flag&(flag-1==0))){
            System.out.println("yes it can be palindrom");
        }else{
            System.out.println("cannot form");
        }
    }
}
