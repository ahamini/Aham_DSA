package Apna_college.Greedy;
import java.util.*;
public class max_string_balanced_partition {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String");
        String str=sc.next();
        int count=0, x=0,y=0;
        String sum="";
        for(int i=0;i<str.length();i++){
            char b=str.charAt(i);
            if(b=='L')
                x++;
            else
                y++;
            if(x==y)
                count++;
            }
        System.out.println(count);
        }
    }

