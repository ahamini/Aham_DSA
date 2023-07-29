package Apna_college.Hashing;
import java.util.*;
public class LinkedHashSet_TreeSet {
    public static void main(String[] args) {
        //HashSet
        HashSet<String> hs = new HashSet<>();
        hs.add("India");
        hs.add("China");
        hs.add("Nepal");
        hs.add("Bhutan");
        System.out.println(hs);

        //LinkedHashSet
        LinkedHashSet<String> lhs=new LinkedHashSet<>();
        lhs.add("India");
        lhs.add("China");
        lhs.add("Nepal");
        lhs.add("Bhutan");
        System.out.println(lhs);

        //TreeSet
        TreeSet<String> ts=new TreeSet<>();
        ts.add("India");
        ts.add("China");
        ts.add("Nepal");
        ts.add("Bhutan");
        System.out.println(ts);
    }
}
