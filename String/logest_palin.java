package String;
import java.util.*;
public class logest_palin {
     static  String longestPalindrome(String s) {
        String ans="";
        for(int i=0;i<s.length();i++){
            String palin="";
            char b=s.charAt(i);
            String palin1="";
            palin1= palin=palin+b;
            for(int j=i+1;j<s.length();j++){
                if(s.charAt(j)==b){
                    palin=palin+s.charAt(j);
                    palin1=s.charAt(j)+palin1;
                    System.out.println(palin +" "+palin1);
                    if(palin.equals(palin1)){
                        if(palin1.length()>ans.length())
                            ans=palin;
                    }
                }

                else{
                    palin=palin+s.charAt(j);
                    palin1=s.charAt(j)+palin1;
                }
            }
        }
        System.out.println((199*199)/2);
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(longestPalindrome("abcbad"));
    }
}
