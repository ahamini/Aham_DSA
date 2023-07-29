package Apna_college.Greedy;
import java.util.*;
public class min_sum_abs_diff {
    public static void main(String[] args) {
        int arr1[] = {4,1,8,7};
        int arr2[] = {2,3,6,5};
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        int total_diff = 0;
        for (int i = 0; i < arr1.length; i++) {
            total_diff += Math.abs(arr1[i] - arr2[i]);
        }
        System.out.println("minimum diffenrce is  "+ total_diff);
    }
}
