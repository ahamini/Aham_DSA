package Apna_college.Array;
import java.util.*;
public class MyClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int arr[] = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }
        int sum = 1, sum2 = 1;
        for (int i = 0; i < N; i++) {
            sum = sum * arr[i];
            for (int j = i + 1; j < N; j++) {
                sum2 = sum2 * arr[j];
            }
            if (!compare(sum, sum2)) {
                System.out.println(i+1);
                break;
            }
            sum2=1;
        }
    }

    public static boolean compare(int sum1, int sum2) {
        boolean trew = false;
        for (int i = 2; i <= sum1; i++) {
            if (isprime(i))
                if (sum1 % i == 0 && sum2 % i == 0) {
                    trew = true;
                }
        }
        return trew;
    }

    public static boolean isprime(int n) {
        for (int i = 2; i < n; i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }
}


