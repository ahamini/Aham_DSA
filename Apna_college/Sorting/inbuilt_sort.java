package Apna_college.Sorting;
import java.util.*;
public class inbuilt_sort {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        int ar[]={3,6,35,3,2,45,9};
        Integer arr1[]={4,2,8,1,4,9,3};
        for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();
        Arrays.sort(arr);
        Arrays.sort(ar,1,4);
        Arrays.sort(arr1,Collections.reverseOrder());
        for(int i=0;i<n;i++){
            System.out.println(arr[i]+" "+ar[i]+" "+arr1[i]);
        }

    }
}
