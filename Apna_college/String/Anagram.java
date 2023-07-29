package Apna_college.String;
import java.util.*;
public class Anagram {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
       A= A.toLowerCase();
       B= B.toLowerCase();
       boolean ans=false;
        if(A.length()==B.length()){
             char[] a=A.toCharArray();
             char[] b=B.toCharArray();
             Arrays.sort(a);
             Arrays.sort(b);
              ans=Arrays.equals(a,b);
        }
        if(ans)
            System.out.println("TRUE");
        else
            System.out.println("FALSE");
    }
}
