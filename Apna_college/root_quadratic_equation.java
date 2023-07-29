//program to Find the Roots of a Quadratic equation.
package Apna_college;
import java.util.*;
public class root_quadratic_equation {
    public static void roots(int a,int b,int c){
        double root1=(-b)+Math.sqrt(b*b-(4*a*c));
        double root2=(-b)-Math.sqrt(b*b-(4*a*c));
        System.out.println("root1: "+root1/(2*a));
        System.out.println("root2:"+root2/(2*a));
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the cofficients :");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        roots(a,b,c);
    }
}
