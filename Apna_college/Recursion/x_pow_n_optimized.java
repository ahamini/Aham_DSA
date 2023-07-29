package Apna_college.Recursion;
import java.util.*;
public class x_pow_n_optimized {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int n=sc.nextInt();
        System.out.println(pow(x,n));
    }
    static int pow(int x,int n) {
        if (n == 0)
            return 1;
        int halfpow = pow(x, n / 2);
        int half_pow = halfpow * halfpow;
        if (n % 2 != 0){
            return x * half_pow;
    }
        return half_pow;
    }
}
