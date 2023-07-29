package Array;
import java.util.*;
public class multiple_ten {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int arr[] = new int[N];
        int arr1[] = new int[N];
        int arr2[] = new int[N];
        int count1 = 0, count2 = 0;
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
            if (arr[i] % 10 == 0)
                arr2[count2++] = arr[i];
            else
                arr1[count1++] = arr[i];
        }
        for (int i = 0; i < count1; i++) {
            arr[i] = arr1[i];
            System.out.println(arr[i]);
        }
        for (int i = 0; i < count2; i++) {
            arr[i + count2-1] = arr2[i];
        }
        for (int i = 0; i < N; i++)
            System.out.println(arr[i]);
    }
}
