package Apna_college.Greedy;
import java.util.*;
public class most_water_container {
    public static int mostWater(int arr[],int n){
        int l=0,r=n-1;
        int max=0,curr_max=0;
        while(l<r){
            if(arr[l]>arr[r])
                curr_max=arr[r]*(r-l);
            else
                curr_max=arr[l]*(r-l);
            if(max<curr_max)
                max=curr_max;
            if(arr[l]>arr[r])
                r--;
            else
                l++;
        }
        return max;
    }

    public static void main(String[] args) {
        int arr[]={1,8,6,2,5,4,8,3,7};
        System.out.println(mostWater(arr,arr.length));
    }
}
