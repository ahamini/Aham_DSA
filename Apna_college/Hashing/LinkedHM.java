package Apna_college.Hashing;
import java.util.*;
public class LinkedHM {
    public static void main(String[] args) {
        LinkedHashMap<String , Integer> lhm=new LinkedHashMap<>(); // keys are in  insertion Ordered
        lhm.put("India",100);
        lhm.put("China",200);
        lhm.put("Nepal",10);
        System.out.println(lhm);
    }
}
