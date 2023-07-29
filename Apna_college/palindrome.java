package Apna_college;
import java.util.*;
public class palindrome {
        public static boolean palin(int n){
            int sum=0;
            int x=n;
            while(n!=0){
                int a=n%10;
                sum=sum*10+a;
                n=n/10;
            }
            return sum==x;
        }

        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
            System.out.println(palin(n));
        }
    }

