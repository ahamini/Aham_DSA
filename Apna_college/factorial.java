//Program to find the Factorial of a Given Number.
package Apna_college;
import java.util.*;
public class factorial {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enetr the number");
        int n=sc.nextInt();
        int fact=1;
        for(int i=1;i<=n;i++)
            fact=fact*i;
        System.out.println(fact);
    }
}
