//Program to reverse the Number
package Apna_college;
import java.util.*;
public class reverse_num {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        int sum=0;
        while(n!=0){
            int a=n%10;
            sum=sum*10+a;
            n=n/10;
        }
        System.out.println(sum);
    }
}
