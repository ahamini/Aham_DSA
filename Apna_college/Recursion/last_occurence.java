package Apna_college.Recursion;
import java.util.*;
public class last_occurence {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();
        int key=sc.nextInt();
        System.out.println(last_occur(arr,key,n-1));
    }
    static int last_occur(int arr[],int key,int i){
        if(i==-1)
            return -1;
        if(arr[i]==key)
            return i;
        return last_occur(arr,key,i-1);
    }
}
