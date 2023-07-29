package Apna_college.String;
import java.util.*;
public class compress_string {
    public static void main(String[] args) {
        String str = "AABBBCDDEF ";
        int count = 1;
        StringBuilder sb = new StringBuilder("");
        for (int i = 0; i < str.length()-1; i++) {
            if (str.charAt(i) == str.charAt(i + 1) )
                count++;
            else {
                if (count > 1) {
                    sb.append(str.charAt(i));
                    sb.append(count);
                } else
                    sb.append(str.charAt(i));
                count = 1;
            }
        }
        System.out.println(sb);
    }
}
