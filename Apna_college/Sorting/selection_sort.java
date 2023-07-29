package Apna_college.Sorting;
import java.util.*;
public class selection_sort {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();
        for(int i=0;i<n-1;i++){
            int key=i;
            for(int j=i+1;j<n;j++) {
                if (arr[j] < arr[key])
                key=j;
            }
                    int temp=arr[i];
                    arr[i]=arr[key];
                    arr[key]=temp;
                }
        for(int i=0;i<n;i++)
            System.out.print(arr[i]+" ");
    }
}
