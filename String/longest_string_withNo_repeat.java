package String;
import java.util.*;
public class longest_string_withNo_repeat {
    public static int lengthOfLongestSubstring(String s) {
        int i=0;
        String dummy=s;
        int max=0;
        String str="";
        while(i<=s.length()-1){
            char b=s.charAt(i);
            String st="";
            st=st+b;
            boolean ans=str.contains(st);
            int len=str.length();
            if(ans==false){
                str=str+b;
                len=len+1;
            }
            else{
                int idx=str.indexOf(b);
                str=str.substring(idx+1);
                str=str+b;
            }
            max=Math.max(len,max);
            i++;
            System.out.println(str);
            System.out.println(max);
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("ohomm"));
    }
}
