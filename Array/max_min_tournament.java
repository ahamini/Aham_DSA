package Array;
import java.util.*;
public class max_min_tournament {
    static class pair {
        int min;
        int max;
    }

    static pair get_result(int arr[], int low, int high) {
        pair minmax = new pair();
        pair mml = new pair();
        pair mmr = new pair();
        int mid;
        if (low == high) {
            minmax.min = arr[0];
            minmax.max = arr[0];
            return minmax;
        }
        if (low + 1 == high) {
            if (arr[0] > arr[1]) {
                minmax.min = arr[1];
                minmax.max = arr[0];
            } else {
                minmax.min = arr[0];
                minmax.max = arr[1];
            }
            return minmax;
        }
        mid = (low + high) / 2;
        mml = get_result(arr, low, mid);
        mmr = get_result(arr, mid + 1, high);

        if (mml.min < mmr.min) {
            minmax.min = mml.min;
        } else {
            minmax.min = mmr.min;
        }

        if (mml.max > mmr.max) {
            minmax.max = mml.max;
        } else {
            minmax.max = mml.max;
        }
        return minmax;
    }

    public static void main(String[] args) {
        int arr[]={3,5,8,12,1,6};
        int size= arr.length-1;
        pair minmax=get_result(arr,0,size);
        System.out.println("maximum element in an array is : "+minmax.max);
        System.out.println("minimum element in an array is : "+minmax.min);
    }
}