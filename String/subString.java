package String;
import java.util.*;
public class subString {
        public static int lengthOfLongestSubstring(String s) {
            String s1=s.replaceAll("\\s","");
           if(s1.length()==0)
               return 0;
           else if(s1.length()==1)
               return 1;
           else {
               ArrayList<Character> result = new ArrayList<>();
               result.add(0, s1.charAt(0));
               int len = 0;
               int len1=0;
               for (int i = 1; i < s1.length(); i++) {
                   char b = s1.charAt(i);
                   if (!result.contains(b)) {
                       result.add(b);
                        len1 = result.size();
                        if(i==s1.length()-1){
                            return len1;
                        }
                   } else {
                     int j= result.indexOf(b);
                     while(j -->0)
                         result.remove(0);
                       if (len1 >= len)
                           len = len1;
                   }
               }
               return len;
           }
        }
    public static void main(String[] args) {
        int ans=lengthOfLongestSubstring("");
        System.out.println(ans);
    }
}
