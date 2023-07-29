package Apna_college.String;
import java.util.*;
public class Shortest_Path {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int x=0;
        int y=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='E')
                x++;
            if(s.charAt(i)=='W')
                x--;
            if(s.charAt(i)=='N')
                y++;
            if(s.charAt(i)=='S')
                y--;
        }
        int result=(int) Math.sqrt(x*x+y*y);
        System.out.println(result);
    }
}
