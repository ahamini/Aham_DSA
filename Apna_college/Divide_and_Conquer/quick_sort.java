package Apna_college.Divide_and_Conquer;
import java.util.*;
public class quick_sort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        QuickSort(arr, 0, n - 1);
        for (int i = 0; i < n; i++)
            System.out.print(arr[i]);
    }

    public static void QuickSort(int arr[], int si, int ei) {
        if (si < ei) {
            int pivot = partition(arr, si, ei);
            QuickSort(arr, si, pivot - 1);
            QuickSort(arr, pivot + 1, ei);
        }
    }

    public static int partition(int arr[], int si, int ei) {
        int pivot = arr[ei];
        int i = si - 1;
        for (int j = si; j < ei; j++) {
            if (arr[j] < pivot) {
                i++;
                //swapkl
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        i++;
        int temp = pivot;
        arr[ei] = arr[i];
        arr[i] = temp;
        return i;
    }
}
