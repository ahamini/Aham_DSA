package Apna_college.Recursion;
import java.util.*;
public class n_to_1 {
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
            System.out.println(n);
        print(n - 1);
    }
}
