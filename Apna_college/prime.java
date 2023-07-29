//Program to find Whether the given number is prime or not Using Normal And Optimized Approach.
package Apna_college;
import java.util.*;
public class prime {
    public static boolean prime_normal(int n){
        for(int i=2;i<n;i++){
            if(n%i==0)
                return false;
        }
        return true;
    }
    public static boolean prime_optimize(int n){
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enetr the Number:");
        int n=sc.nextInt();
        System.out.println(prime_normal(n));
        System.out.println(prime_optimize(n));
    }
}
