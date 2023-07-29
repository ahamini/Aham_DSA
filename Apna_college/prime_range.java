package Apna_college;
import java.util.*;
public class prime_range {
    public static void range(int n){
        int count=0;
        for(int i=2;i<=Math.sqrt(n);i++){
            if(i%2==0)
                count++;
        }
        if(count>0)
            System.out.println(n);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Range");
        int n=sc.nextInt();
        for(int i=2;i<=n;i++){
            range(i);
        }
    }}
