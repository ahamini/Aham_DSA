package Apna_college.Array;

import java.util.Scanner;

public class max_subArray_Prefix {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        int prefix[]=new int[n];
        int sum1=0;
        for(int i=0;i<n;i++) {
            arr[i] = sc.nextInt();
            sum1 = sum1 + arr[i];
            prefix[i] = sum1;
        }
        int max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            int start=i;
            int sum=0;
            for(int j=0;j<n;j++){
                int end=j;
               sum=start==0?prefix[start]:prefix[end]-prefix[start-1];
                max=Math.max(sum,max);
            }
        }
        System.out.println(max);
    }
}
