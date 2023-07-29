package Array;
import java.util.*;
public class dec_to_bin {
    public static void main(String args[]) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter your Decimal Value");
//        int n = sc.nextInt();
//        long bin = 0;
//        int fst = 0;
//        while (n != 0) {
//            int a = n % 2;
//            bin = bin + (int) (a * Math.pow(10, fst));
//            fst++;
//            n = n / 2;
//        }
//        System.out.println(bin);
        hasContineousOnes(5,11);
    }

    public static void hasContineousOnes(long n, long m) {
        for (long i =  + 1; i < n; i++) {
            long x = i;
            long bin = 0;
            int fst = 0;
            while (x != 0) {
                long a = x % 2;
                bin = bin + (long) (a * Math.pow(10, fst));
                fst++;
                x = x / 2;
            }
            String binary = Long.toString(bin);
            if (binary.contains("11")==false) ;
            System.out.println(bin);
        }
    }
}