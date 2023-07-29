package Apna_college.Hashing;
import java.util.*;
public class Count_Distinct_Element {
    public static void main(String[] args) {
        int arr[]={1,3,2,4,8,3,4,3,2,5,6,5,1};
        HashSet<Integer> hs=new HashSet<>();
        for(int i=0;i<arr.length;i++){
            hs.add(arr[i]);
        }
        System.out.println(hs.size());
    }
}
