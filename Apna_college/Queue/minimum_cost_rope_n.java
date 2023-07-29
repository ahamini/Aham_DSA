package Apna_college.Queue;
import java.util.*;
public class minimum_cost_rope_n {
    public static void main(String[] args) {
        int arr[]={4,3,2,6};
        PriorityQueue<Integer> periority=new PriorityQueue<Integer>();
        for(int i=0;i<arr.length;i++){
            periority.add(arr[i]);
        }
        int res=0;
        while(periority.size()>1){
            int first=periority.poll();
            int second=periority.poll();
            res=res+first+second;
            periority.add(first+second);
        }
        System.out.println(res);
    }
}
