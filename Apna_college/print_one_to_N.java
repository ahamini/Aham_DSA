//Program to print the numbers from 1 to N.
package Apna_college;
import java.util.*;
public class print_one_to_N {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of N");
        int N=sc.nextInt();
        int i=1;
        while(i<=N){
            System.out.print(i+" ");
            i++;
        }
    }
}
