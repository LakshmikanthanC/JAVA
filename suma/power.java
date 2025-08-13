package suma;
import java.util.*;

public class power {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for(int p = 0; p <= N; p++) {
            System.out.print((1 << p) + " ");
        }
        sc.close();
    }
}
