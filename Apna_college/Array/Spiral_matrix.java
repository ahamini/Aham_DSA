package Apna_college.Array;
import java.util.*;
public class Spiral_matrix {
    public static void main(String[] args) {
        int arr[][]={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        int start_row=0;
        int end_row=arr.length-1;
        int start_col=0;
        int end_col=arr[0].length-1;
        while(start_row<end_row && start_col<end_col){
            for(int j=start_col;j<=end_col;j++)
                System.out.print(arr[start_row][j]+" ");
            for(int j=start_row+1;j<=end_row;j++)
                System.out.print(arr[j][end_col]+" ");
            for(int j=end_col-1;j>=start_col;j--)
                System.out.print(arr[end_row][j]+" ");
            for (int j=end_row-1;j>=start_row+1;j--)
                System.out.print(arr[j][start_col]+" ");
            start_col++;
            start_row++;
            end_col--;
            end_row--;
        }
    }
}
