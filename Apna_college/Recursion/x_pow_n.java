package Apna_college.Recursion;
import java.util.*;
public class x_pow_n {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int n=sc.nextInt();
        System.out.println(pow(x,n));
    }
    static int pow(int x,int n){
        if(n==1)
            return x;
        else
            return pow(x,n-1)*x;
    }
}
