package Array;
import java.util.*;
public class num_fullpyramid {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the height");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = i; j <= n - 1; j++)
                System.out.print(" ");
            for (int k = 1; k <= i; k++)
                System.out.print(i + " ");
            System.out.println();
        }
    }
}
