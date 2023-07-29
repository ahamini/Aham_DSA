package Apna_college;

import java.util.Scanner;
import java.util.*;
public class holow_rec {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length and bredth");
        int len=sc.nextInt();
        int bred=sc.nextInt();
        for(int i=1;i<=bred;i++){
            for(int j=1;j<=len;j++){
                if(i==1 ||i==bred ||j==1 ||j==len)
                System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }
}
