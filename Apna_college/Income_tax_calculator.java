//Program to find the Income tax paid for Salary N.
package Apna_college;
import java.util.*;
public class Income_tax_calculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Salary");
        int n=sc.nextInt();
        if(n<=500000)
            System.out.println(0);
        else if (n > 500000 && n <= 1000000)
                System.out.println(10 * n / 100.0);
        else
        System.out.println(20*n/100.0);
    }
}
