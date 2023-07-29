package Apna_college.Recursion;
import java.util.*;
public class Nth_occurence {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();
        int x=sc.nextInt();
        print_occurence(arr,0,x);
    }
    static void print_occurence(int arr[],int n,int x){
                if(n==arr.length)
                    return;
                if(arr[n]==x)
                    System.out.println(n);
                print_occurence(arr,n+1,x);
    }
}
