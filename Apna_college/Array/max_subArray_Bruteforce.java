package Apna_college.Array;
import java.util.*;
public class max_subArray_Bruteforce {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();
        int max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++)
        {
            int start=i;
            for(int j=0;j<n;j++){
                int end=j;
                int sum=0;
                for(int k=start;k<=end;k++)
                    sum=sum+arr[k];
                max=Math.max(sum,max);
            }
        }
        System.out.println(max);
    }
}
