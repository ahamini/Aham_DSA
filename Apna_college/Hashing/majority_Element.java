package Apna_college.Hashing;
import java.util.*;
public class majority_Element {
    public static void main(String[] args) {
        int arr[]={1,2,3,1,3,4,3,2,1};
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(hm.containsKey(arr[i])){
                hm.put(arr[i],hm.get(arr[i])+1);
            }
            else
                hm.put(arr[i],1);
        }
        Set<Integer> keys=hm.keySet();
        for (Integer key:keys) {
            if(hm.get(key)>=(arr.length)/3)
                System.out.println(key);
        }
    }
}
