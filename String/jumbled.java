package String;
import java.util.*;
public class jumbled {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int n=s.length();
        String a=s.substring(0,n/3);
        String b=s.substring(n/3,2*n/3);
        String c=s.substring(2*n/3);
        System.out.println(a+b+c);
    }
}
