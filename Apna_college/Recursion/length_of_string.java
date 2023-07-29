package Apna_college.Recursion;
import java.util.*;
public class length_of_string {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        System.out.println(lenght(str));
    }
    static int lenght(String str){
        if(str.length()==0)
            return 0;
      return  lenght(str.substring(1))+1;
    }
}