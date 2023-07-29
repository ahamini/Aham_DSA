package String;
import javax.swing.*;
import java.util.*;
public class hemant_delloit {
    static int ans1 = 0, ans2= 0, i = 0;

    //
    public static ArrayList<Integer> find(int X, ArrayList<Integer> ls, int arr[][],int a,int b,int y) {
        if (a > 0 && b > 0) {
            if (!ls.contains(arr[a - 1][b - 1])) {
                ls.add(++y, arr[a - 1][b - 1]);
            }
        }
        if (a > 0 && b < arr.length - 1) {
            if (!ls.contains(arr[a - 1][b + 1])) {
                ls.add(++y,arr[a - 1][b + 1]);
            }
        }
        if (a + 1 < arr.length && b > 0) {
            if (!ls.contains(arr[a + 1][b - 1])) {
                ls.add(++y,arr[a + 1][b - 1]);
            }
        }

        if (a < arr.length - 1 && b < arr.length - 1) {
            if (!ls.contains(arr[a + 1][b + 1])) {
                ls.add(++y,arr[a + 1][b + 1]);
            }
        }
        return ls;
    }

    public static void DiagonalElement(int arr[][], int X) {
        ArrayList<Integer> ls = new ArrayList<>();
        ls.add(X);
        while(i<ls.size()) {
            for (int l = 0; l < arr.length; l++) {
                for (int j = 0; j < arr.length; j++) {
                    if (arr[l][j] == ls.get(i)) {
                        ans1 = l;
                        ans2 = j;
                    }
                }
            }
            find(ls.get(i), ls, arr,ans1,ans2,i);
            i++;
        }
        System.out.println(ls);
    }


    public static void main(String[] args) {
        int arr[][] = {{71,13,19,75,47},
                {77,66,69,100,91},
                {9,21,44,20,23},
                {22,95,28,18,98},
                {3,62,82,73,84}};

            DiagonalElement(arr, 47);

    }
}
