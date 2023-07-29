package Array;
import java.util.*;
public class string_max_min {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int n=Integer.parseInt(s);
        int min=9;
        int max=0;
        while(n!=0){
            int a=n%10;
            if(a<min)
                min=a;
            if(a<max)
                max=a;
        }
        System.out.println(max);
    }
}
