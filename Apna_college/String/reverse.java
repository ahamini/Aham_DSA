package Apna_college.String;
import java.util.*;
public class reverse {
        public static String reverseWordWise(String str) {
            String sum="";
            for(int i=0;i<str.length()-1;i++){
                if(str.charAt(i)!=str.charAt(i+1))
                    sum=sum+str.charAt(i);
            }
            return sum;
        }

    public static void main(String[] args) {
        System.out.println(reverseWordWise("aaabbccd"));
    }
    }

