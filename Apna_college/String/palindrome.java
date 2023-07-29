package Apna_college.String;
import java.util.*;
public class palindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int count=0;
        for(int i=0;i<s.length()/2;i++){
            if(s.charAt(i)!=s.charAt(s.length()-1-i))
                count=1;
        }
        if(count==0)
            System.out.println("Palindrome");
        else
            System.out.println("Not");
    }
}
