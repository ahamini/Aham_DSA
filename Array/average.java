package Array;
import java.util.*;
class average {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int row = sc.nextInt();
        int col = sc.nextInt();

        int arr[][] = new int[row][col];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
       int res[]= sortstudentMarks(row,col,arr);
        for (int j = 0; j < res.length; j++) {
            System.out.print(res[j] + " ");
        }
    }
        public static int[] sortstudentMarks ( int input1,int input2, int[][] input3){
        int row1 = input1;
        int col1 = input2;
        int res[] = new int[row1];
        int avg[] = new int[row1];
        int ans[] = new int[row1];

        for (int i = 0; i < row1; i++) { //calculating and storing average of each column
            for (int j = 0; j < row1; j++) {
                ans[i] += input3[j][i];

            }
            avg[i] = ans[i] / row1;

        }

        int min = avg[0];
        int eleminate_Index = 0;
        for (int i = 1; i < row1; i++) { // minimum average calculated and ..
            if (avg[i] < min) {
                min = avg[i];
                eleminate_Index = i; //..index of it stored.
            }
        }
        for (int i = 0; i < row1; i++) {
            for (int j = 0; j < col1; j++) {
                if (eleminate_Index != j) {//calculating sum of remaining subjects
                    res[i] += input3[i][j];
                }
            }
        }
        return res;
    }
}