import java.util.*;

public class pro9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a=sc.nextInt();
        long b=sc.nextInt();
        System.out.println(findHCF(a + b));
}
    private static long findHCF(long n) {
        long hcf = 1;
        for (long i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                hcf = i;
            }
        }
        return hcf;
}
}