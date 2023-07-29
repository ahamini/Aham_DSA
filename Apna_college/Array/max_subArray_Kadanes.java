package Apna_college.Array;
import java.util.*;
public class max_subArray_Kadanes {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();
        int CS=0;
        int MS=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            CS=CS+arr[i];
            if(CS>0)
                MS=Math.max(MS,CS);
            else
                CS=0;
        }
        System.out.println(MS);
    }
}
