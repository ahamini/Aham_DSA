package Apna_college.Divide_and_Conquer;
import java.util.*;
public class majority_element {
    public static void main(String[] args) {
        int arr[] = {2, 2, 1, 1, 1,1, 2};
        System.out.println(majority(arr, 0, arr.length - 1));
    }

    public static int count_num(int arr[], int num, int si, int ei) {
        int occur = 0;
        for (int j = si; j <= ei; j++) {
            if (arr[j] == num)
                occur++;
        }
        return occur;
    }

    public static int majority(int arr[], int si, int ei) {
        if (si == ei) {
            return arr[si];
        }
        int mid = (si + ei) / 2;
        int left = majority(arr, si, mid);
        int right = majority(arr, mid + 1, ei);
        if (left == right)
            return left;
        int leftCount = count_num(arr, left, si, ei);
        int rightCount = count_num(arr, right, si, ei);
        return leftCount > rightCount ? left : right;
    }
}
