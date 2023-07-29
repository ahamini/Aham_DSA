package Apna_college.Hashing;
import java.util.*;
public class HashMap_Iterate {
    public static void main(String[] args) {
        HashMap<String,Integer> hm=new HashMap<>();
        hm.put("Zeeshan",400);
        hm.put("Hemant",300);
        hm.put("AnshVed",500);
        hm.put("Aham",400);

        //Iterate the HashMap
        Set<String> keys=hm.keySet();
        for (String key:keys)
        {
            System.out.println("Key= "+key+"  "+"value="+hm.get(key));
        }
    }
}
