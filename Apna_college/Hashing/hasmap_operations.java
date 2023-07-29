package Apna_college.Hashing;

import java.util.HashMap;

    public class hasmap_operations{
        public static void main(String [] args){
            HashMap<String,Integer> hm=new HashMap<>();
            // put(key,value)
            hm.put("Zeeshan",400);
            hm.put("Hemant",300);
            hm.put("AnshVed",500);
            hm.put("Aham",400);
            System.out.println(hm);

            // get(key)-value or null
            System.out.println(hm.get("Hemant"));
            System.out.println(hm.get("Aham"));

            //containsKey(Key) -> true or false
            boolean a=hm.containsKey("Aham");
            boolean b=hm.containsKey("ansh");
            System.out.println(a);
            System.out.println(b);

            //remove(key) -> returns a value
            hm.remove("Zeeshan");
            System.out.println(hm);

            //size()
            System.out.println(hm.size());

            //clear()
            hm.clear();;
            System.out.println(hm);

        }
    }

