//Program to find the sum of First N natural numbers.
package Apna_college;
import java.util.*;
public class syum_of_all_natural {
    public static int sum(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++)
            sum = sum + i;
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the nUmber:");
        int n = sc.nextInt();
        System.out.println("The sum of n Natural numbers is :" + sum(n));
    }
}
