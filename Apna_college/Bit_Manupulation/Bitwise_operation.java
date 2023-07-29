package Apna_college.Bit_Manupulation;
import java.util.*;
public class Bitwise_operation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("The AND value of a and B is:" + (a & b));
        System.out.println("The OR value of a and B is:" + (a | b));
        System.out.println("The Negation value of a is:" + ~a);
        //Get ith bit i=3
        int i = 3;
        int x = 10;
        int bitmask = 1 << i;
        if ((x & bitmask) == 0)
            System.out.println("0");
        else
            System.out.println(1);
        //set ith bit
        System.out.println(x | bitmask);
        //clear ith bit
        System.out.println(x&~(bitmask));
        //update ith bit
        int newbit=1;
            x=x&~(bitmask);
            int newmask=newbit<<i;
            System.out.println(x|newmask);
        }
    }

