package Apna_college.Hashing;
import java.util.*;
public class Anagram {

    public static boolean anagram(String a, String b) {
        if (a.length() != b.length())
            return false;

        HashMap<Character, Integer> hm = new HashMap<>();
        for (int i = 0; i < a.length(); i++) {
            char x = a.charAt(i);
            if (hm.containsKey(x)) {
                hm.put(a.charAt(i), hm.get(x) + 1);
            } else
                hm.put(a.charAt(i), 1);
        }
        for (int i = 0; i < b.length(); i++) {
            char y = b.charAt(i);
            if (hm.containsKey(y)) {
                if (hm.get(y) == 1)
                    hm.remove(y);
                else
                    hm.put(y, hm.get(y) - 1);
            } else
                return false;
        }
        if (hm.size() == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        String a = "aham";
        String b = "amh";
        System.out.println(anagram(a, b));
    }
}
