package searching_sorting;
import java.util.*;
public class insertion_sort {
    public static void insertion(int arr[],int n){
        for(int i=1;i<n;i++){
            int current=arr[i];
            int prev=i-1;
            while(prev>=0 && arr[prev]>current){
                arr[prev+1]=arr[prev];
                prev--;
                }
            arr[prev+1]=current;
            }
        for(int i=0;i<n;i++)
            System.out.print(arr[i]+" ");
    }

    public static void main(String[] args) {
        int arr[]={3,2,45,22,4,22};
        insertion(arr,arr.length);
    }
}
