package Apna_college;
import java.util.*;
public class pattern_29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Height");

        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = i; j >= 1; j--)
                System.out.print(j);
            if (i > 1) {
                for (int j = 2; j <= i; j++)
                    System.out.print(j);
            }
                System.out.println();

        }
    }
}
