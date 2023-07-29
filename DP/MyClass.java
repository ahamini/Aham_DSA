package DP;
import java.util.*;
public class MyClass {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int K=sc.nextInt();
        int arr[]=new int[N];
        for(int i=0;i<N;i++){
            arr[i]=sc.nextInt();
        }
        int min=arr[K];
        for(int i=K;i<N;i++) {
            if (min > arr[i])
                min = arr[i];
        }
        System.out.println(min);
    }
}
