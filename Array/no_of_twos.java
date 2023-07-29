package Array;
import  java.util.*;
public class no_of_twos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int K = sc.nextInt();
        int arr[] = new int[K];
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 2) {
                index = i;
                break;
            }
        }
            System.out.println(arr.length - index);
        }
    }

