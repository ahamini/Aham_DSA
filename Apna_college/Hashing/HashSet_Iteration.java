package Apna_college.Hashing;
import java.util.*;
public class HashSet_Iteration {
    public static void main(String[] args) {
        HashSet<String> hs = new HashSet<>();
        hs.add("India");
        hs.add("China");
        hs.add("Nepal");
        hs.add("Bhutan");
        System.out.println(hs);
//         // iterate using iterator interface
//        Iterator i=hs.iterator();
//        while(i.hasNext()){
//            System.out.println(i.next());
//    }
        // using Advance loop
        for(String key: hs){
            System.out.println(key);
        }
    }
}
