package Apna_college.Sorting;
import java.util.*;
public class student {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int A=sc.nextInt();
        int B=sc.nextInt();
        int M=sc.nextInt();
        int result=factorial(A)/(factorial(B)*factorial(A-B));
        System.out.println(result%M);
        }
        static int factorial(int n){
        int fact=1;
        for(int i=1;i<=n;i++)
            fact=fact*i;
        return fact;
    }
}
