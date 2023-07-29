package Apna_college.Greedy;
import java.util.*;
public class Buy_Sell_stocks {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq=new PriorityQueue<>(6);
        int[] arr = {7, 1, 5, 3, 6, 4};
        int max[] = new int[arr.length];
        int maxim= Integer.MIN_VALUE;
        for(int i=max.length-1;i>=0;i--){
            maxim=Math.max(arr[i],maxim);
            max[i]=maxim;
            pq.offer(arr[i]);

        }
        System.out.println(pq);
        int maximum=0;
        for(int i=0;i<arr.length;i++){
            maximum=Math.max(maximum,max[i]-arr[i]);
        }
        System.out.println(maximum);
    }
}
