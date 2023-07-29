package Apna_college.Array;
import java.util.*;
public class diagonal_sum {
    public static void main(String[] args) {
        int arr[][]={{1,2,3},{5,6,7},{9,10,11}};
        int sum=0;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++) {
                if (i == j || i + j == arr.length - 1) {
                    sum = sum + arr[i][j];
                    System.out.println(arr[i][j]);
                }
            }
        }
        System.out.println(sum);
    }
}
