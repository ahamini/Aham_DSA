package Apna_college.String;
import java.util.*;
public class convert_upperCase {
    public static void main(String[] args) {
        String str = "my name is aham patel";
        StringBuilder sb = new StringBuilder("");
        sb.append(Character.toUpperCase(str.charAt(0)));
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == ' ' && i != str.length() - 1) {
                sb.append(str.charAt(i));
                i++;
                sb.append(Character.toUpperCase(str.charAt(i)));
            } else
                sb.append(str.charAt(i));
        }
        System.out.println(sb);
    }
}
