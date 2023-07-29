package Apna_college.Recursion;
import java.util.*;
public class array_sorted_check {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();
        System.out.println(isSorted(arr,n-1));
    }
    static boolean isSorted(int arr[],int n){
        if(n==0)
            return true;
        else{
            return arr[n]>arr[n-1] && isSorted(arr,n-1);
        }
    }
}
