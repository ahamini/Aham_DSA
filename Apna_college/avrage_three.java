//Program to find the average of three numbers.
package Apna_college;
import java.util.*;
public class avrage_three {
    public static double average(int a,int b,int c){
        return (a+b+c)/3f;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the numbers :");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        System.out.println(average(a,b,c));
    }
}
