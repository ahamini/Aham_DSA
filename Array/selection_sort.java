package Array;
import java.util.*;
public class selection_sort {
    public static void selection(int arr[],int n){
        for(int i=0;i<n;i++){
            int low=i;
            for(int j=i+1;j<n;j++) {
                if (arr[low] > arr[j])
                    low = j;
            }
                    int temp=arr[low];
                    arr[low]=arr[i];
                    arr[i]=temp;
                }
        for(int i=0;i<n;i++)
            System.out.print(arr[i]+" ");
    }

    public static void main(String[] args) {
        int arr[]={3,2,45,22,4,22};
        selection(arr,arr.length);
    }
}
