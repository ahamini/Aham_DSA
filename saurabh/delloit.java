package saurabh;
import java.util.*;
public class delloit {
    public static int remainChoco(int n,int x) {
        int box = -1;
        int y = n - x;
        if (x == y || x == 0 || y == 0) {
            return x + y;
        } else {
            if (x > y)
               box= remainChoco(x, x - y);
            else
              box=  remainChoco(y, x);
        }
        return box;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int x=sc.nextInt();
        System.out.println(n-remainChoco(n,x));
        System.out.println(1|8);
    }
}
