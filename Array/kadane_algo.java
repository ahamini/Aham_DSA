package Array;
import java.util.*;
public class kadane_algo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length and elemnts of an Array");
        int n= sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();
        int cs=0,ms=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            cs=cs+arr[i];
            if(cs<0)
                cs=0;
            if(cs>ms)
                ms=cs;
        }
        System.out.println(ms);
    }
}
