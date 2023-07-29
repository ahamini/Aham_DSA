package Apna_college.Recursion;
import java.util.Scanner;
public class one_to_n {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            print(n);
        }
        static void print(int n) {
            if (n == 1) {
                System.out.println(1);
                return;
            }
            print(n - 1);
            System.out.println(n);

        }
}
