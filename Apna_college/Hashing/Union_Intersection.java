package Apna_college.Hashing;
import java.util.*;
public class Union_Intersection {
    public static void main(String[] args) {
        int arr1[]={7,3,9};
        int arr2[]={6,3,9,2,9,4};
         //Union

        HashSet<Integer> hs=new HashSet<>();
        for(int i=0;i<arr1.length;i++){
            hs.add(arr1[i]);
        }
        for(int i=0;i<arr2.length;i++){
            hs.add(arr2[i]);
        }
        System.out.println("Union set : "+hs.size() );

        // Intersection
        hs.clear();
        for(int i=0;i<arr1.length;i++){
            hs.add(arr1[i]);
        }
        int count=0;
        for(int i=0;i<arr2.length;i++){
            if(hs.contains(arr2[i])){
                count++;
                hs.remove(arr2[i]);
            }
        }
        System.out.println("Intersection set : "+ count);
    }
}
