//Program to find the Sum of two Numbers.
package Apna_college;
import java.util.*;
public class sum_of_two_num {
    public static int sum(int a,int b){
        return a+b;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b= sc.nextInt();
        System.out.println(sum(a,b));

    }
}
