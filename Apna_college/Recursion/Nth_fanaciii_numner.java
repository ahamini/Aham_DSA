package Apna_college.Recursion;
import java.util.*;
public class Nth_fanaciii_numner {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(fabnnaci(n));
    }
    static int fabnnaci(int n){
        if(n==0)
            return 0;
        else
            if(n==1)
                return 1;
            else
                return fabnnaci(n-1)+fabnnaci(n-2);
    }
}
