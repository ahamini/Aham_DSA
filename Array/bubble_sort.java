package Array;
import java.util.*;
public class bubble_sort {
    public static void bubble(int arr[],int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        for(int i=0;i<n;i++)
            System.out.print(arr[i]+" ");
    }

    public static void main(String[] args) {
        int arr[]={3,2,45,22,4,22};
        bubble(arr,arr.length);
    }
}
