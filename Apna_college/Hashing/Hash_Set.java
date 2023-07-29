package Apna_college.Hashing;
import java.util.*;
public class Hash_Set {
    public static void main(String[] args) {
        HashSet<Integer> set=new HashSet<>();
        set.add(1); //add(key) -> O(1)
        set.add(4);
        set.add(3);
        set.add(2);
        set.add(4);
        set.add(3);
        System.out.println(set);

        //contains(key) -> O(1)
        System.out.println(set.contains(2));

        //remove(key) -> O(1)
        set.remove(3);
        System.out.println(set);

        //size(),isEmpty(),clear()
        System.out.println(set.size());
        System.out.println(set.isEmpty());
        set.clear();
        System.out.println(set.isEmpty());
    }
}
