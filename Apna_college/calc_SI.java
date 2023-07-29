//Program to Find the Simple Interst.
package Apna_college;
import java.util.*;
public class calc_SI {
    public static double SI(int p,float r,int t){
        return((p*r*t)/100);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int p= sc.nextInt();
        float r=sc.nextFloat();
        int t=sc.nextInt();
        System.out.println("The Simple Interest is: "+SI(p,r,t));
    }
}
