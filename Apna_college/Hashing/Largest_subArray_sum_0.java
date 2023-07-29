package Apna_college.Hashing;
import java.util.*;
public class Largest_subArray_sum_0 {
    public static void main(String[] args) {
        int arr[]={15,-2,2,-8,1,7,9};
        HashMap<Integer,Integer> hm=new HashMap<>();

        int len=0;
        int sum=0;
        for(int j=0;j<arr.length;j++){
            sum=sum+arr[j];
            if(hm.containsKey(sum))
                len=Math.max(len,j-hm.get(sum));
            else
                hm.put(sum,j);
        }
        System.out.println(" length of largest subArray with Sum O : "+len);
    }
}
