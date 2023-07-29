package Array;
import java.util.*;
public class integer_zero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int K = sc.nextInt();
        String s = sc.next();
        String str = "";
        for (int i = 1; i <= K; i++)
            str = str + s;
        int count = 0;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '0' && i != str.length() - 1)
                count++;
            else {
                max = Math.max(count, max);
                count = 0;
            }
        }
        System.out.println(max);
    }
}
