package Apna_college.Divide_and_Conquer;
import java.util.*;
public class Merge_sort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        merge_sort(arr, 0, n - 1);
        for (int i = 0; i < n; i++)
            System.out.print(arr[i]);
    }

    public static void merge_sort(int arr[], int si, int ei) {
        if (si < ei) {
            int mid = (ei + si) / 2;
            merge_sort(arr, si, mid);
            merge_sort(arr, mid + 1, ei);
            merge(arr, si, mid, ei);
        }
    }
    public static void merge(int arr[], int si, int mid, int ei) {
        int temp[] = new int[ei - si + 1];
        int i = si;
        int j = mid + 1;
        int k = 0;
        while (i <= mid && j <= ei) {
            if (arr[i] < arr[j]) {
                temp[k] = arr[i];
                i++;
            } else {
                temp[k] = arr[j];
                j++;
            }
            k++;
        }
        while (i <= mid) {
            temp[k++] = arr[i++];
        }
        while (j <= ei) {
            temp[k++] = arr[j++];
        }
        for (k = 0, i = si; k < temp.length; k++, i++) {
            arr[i] = temp[k];
        }
    }
}

