package Apna_college.Divide_and_Conquer;
import java.util.*;
public class sorted_rotated_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        int target = sc.nextInt();
        System.out.println(search(arr, 0, n - 1, target));
    }

    public static int search(int arr[], int si, int ei, int target) {
        if (si > ei) {
            return -1;
        } else {
            int mid = (si + ei) / 2;
            if (arr[mid] == target)
                return mid;
            if (arr[si] <= arr[mid]) {
                if (target >= arr[si] && target <= arr[mid])
                    return search(arr, si, mid - 1, target);
                else
                   return search(arr, mid + 1, ei, target);
            } else {
                if (target >= arr[mid] && target <= arr[ei])
                    return search(arr, mid + 1, ei, target);
                else
                    return search(arr, si, mid - 1, target);
            }
        }
    }
}
