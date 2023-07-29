package String;
import java.util.*;
class palindrome {
    public boolean isPalindrome(String s) {
        String str = "", result = "";
        s.toLowerCase();
        for (int i = 0; i < s.length(); i++) {
            char b = s.charAt(i);
            int x = b;
            if (x >= 97 && x <= 122) {
                str = str + b;
                result = b + result;
            }
            else
                if(x>=48 && x<=57)
                    return false;
        }
        System.out.println(str);
        System.out.println(result);
        if (str.compareTo(result) == 0)
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        palindrome ob=new palindrome();
        System.out.println(ob.isPalindrome("0p"));
    }
}
