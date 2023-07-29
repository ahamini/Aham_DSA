package Array;
import java.util.*;
public class fibinoci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(fabic(n));
    }
        public static boolean fabic(int n){
        int a = 0;
        int b = 1;
        int count=0;
        if (n == 0)
            return true;
        else if (n ==1)
            return false;
        else {
            while ((a + b) <= n) {
                int c = a + b;
                a = b;
                b = c;
                if (a + b == n) {
                    count++;
                    break;
                }
            }
            if(count==1)
                return true;
            else
                return false;
        }
    }
}
