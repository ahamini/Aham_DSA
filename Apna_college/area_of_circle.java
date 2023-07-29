//Program to Find the Area of Circle and Square
package Apna_college;
import java.util.*;
public class area_of_circle {
    public static double circle(int r){
        return 3.14*r*r;
    }
    public static int square(int d){
        return d*d;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the radius:");
        System.out.println("Enter the side:");
        int r=sc.nextInt();
        int d=sc.nextInt();
        System.out.println("Area of ciecle :"+circle(r));
        System.out.println("Area of square :"+square(d));
    }
}
