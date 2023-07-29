package Apna_college.Array;
import java.util.*;
public class Linear_search {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int key=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();
        int index=linear(n,key,arr);
        if(index==-1)
            System.out.println("Element not found");
        else
        System.out.println("Element found at position :"+(index+1));
    }
    static int linear(int n,int key,int arr[]){
        int index=-1;
        for(int i=0;i<n;i++){
            if(arr[i]==key)
                index=i;
        }
        return index;
    }
}
