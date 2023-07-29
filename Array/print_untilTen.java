package Array;
import java.util.*;
public class print_untilTen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            int n = sc.nextInt();
            if (n % 10 != 0)
                System.out.println(n);
            else {
                System.out.println("EXIT");
                break;
            }
        }
    }
}
