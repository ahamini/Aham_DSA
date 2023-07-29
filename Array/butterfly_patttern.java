package Array;
import java.util.*;
public class butterfly_patttern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your height");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            if (i <= n / 2) {
                for (int j = 1; j <= n; j++) {
                    if (j <= i || j > n - i)
                        System.out.print("*");
                    else
                        System.out.print(" ");
                }
            }  else {
                for (int j = 1; j <= n; j++) {
                    if (j<=n-i+1 ||j>=i)
                        System.out.print("*");
                    else
                        System.out.print(" ");
                }
            }
            System.out.println();

        }
    }
}
