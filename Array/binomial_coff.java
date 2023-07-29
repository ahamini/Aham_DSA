package Array;
import java.util.*;
public class binomial_coff {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the values of N and R :");
        int n=sc.nextInt();
        int r= sc.nextInt();
        int result=bin_coff(n,r);
        System.out.println(result);
    }
    public static int fact(int n){
        int result=1;
        for(int i=1;i<=n;i++){
            result=result*i;
        }
        return result;
    }
    public static int bin_coff(int n ,int r){
        return fact(n)/(fact(r)*fact(n-r));
    }
}
