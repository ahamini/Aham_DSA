package Apna_college.Recursion;
import java.util.*;
public class binary_string {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        print_binary(n,0,"");
    }
    static void print_binary(int n,int last,String str){
        if(n==0) {
            System.out.println(str);
            return;
        }
        print_binary(n-1,0,str+"0");
        if(last==0)
            print_binary(n-1,1,str+"1");
    }
}
