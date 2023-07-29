//Program to find the Whether the number is Odd or Even.
package Apna_college;
import java.util.*;
public class odd_Even {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int N=sc.nextInt();
        if(N%2==0)
            System.out.println("Even");
        else
            System.out.println("Odd");
    }
}
