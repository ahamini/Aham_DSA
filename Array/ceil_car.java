package Array;
import java.util.*;
public class ceil_car {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r1 = sc.nextInt();
        int n = sc.nextInt();
        int r2 = sc.nextInt();
        int x = sc.nextInt();
        int time = (int) Math.ceil((double) x / 60.0);
        if (time<=n) {
            int result = time * r1;
            System.out.println(result);
        } else {
            int result = (n * r1) + (time - n) * r2;
            System.out.println(result);
        }
    }
}
