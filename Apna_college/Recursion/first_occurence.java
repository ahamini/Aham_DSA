package Apna_college.Recursion;
import java.util.*;
public class first_occurence {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();
        int key=sc.nextInt();
        System.out.println(first_occur(arr,key,0));
    }
    static int first_occur(int arr[],int key,int i){
        if(i==arr.length)
            return -1;
        if(arr[i]==key)
            return i;
            return first_occur(arr,key,i+1);
        }
    }

