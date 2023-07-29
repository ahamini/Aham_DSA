package Apna_college.Stack;
import java.util.*;
public class trappng_rain_water {
    public static void main(String[] args) {
        int arr[]={7,0,4,2,5,0,6,4,0,5};
        Stack<Integer> s=new Stack<>();
        int max=Integer.MIN_VALUE;
        for(int i=arr.length-1;i>=0;i--){
            max=Math.max(arr[i],max);
                s.push(max);
        }
        System.out.println(s);
        int sum=0;
        for(int i=0;i<arr.length;i++){
            int curr=s.pop();
            sum=sum+(curr-arr[i]);
        }
        System.out.println(sum);
    }
}
