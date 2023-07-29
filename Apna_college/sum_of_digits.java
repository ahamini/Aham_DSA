package Apna_college;
import java.util.*;
public class sum_of_digits {
    public static int sum(int n){
        int sum=0;
        while(n!=0){
            int a=n%10;
            sum=sum+a;
            n=n/10;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(sum(n));
    }
}
