package Apna_college.Array;
import java.util.*;
public class reverse_aaray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        reverse(arr,n-1);
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void reverse(int arr[],int n){
        for(int i=0;i<n/2;i++){
            int temp=arr[i];
            arr[i]=arr[n-i];
            arr[n-i]=temp;
        }
    }
}
