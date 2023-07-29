//Program to find the MAX among three numbers.
package Apna_college;
import java.util.*;
public class max_threre_num {
    public static int max(int a,int b,int c){
        if(a>b && a>c)
            return a;
        else if(b>a && b>c)
            return b;
        else
            return c;
    }
    public static int max_ternary(int a,int b,int c){
        int max=a>b?a>c?a:c :b>c?b:c;
        return max;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the numbers :");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        System.out.println("max among three is: "+max(a,b,c));
        System.out.println("max among three is: "+max_ternary(a,b,c));
    }
}
