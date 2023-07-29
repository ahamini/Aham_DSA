package saurabh;
import java.util.*;
public class accaloit_incresing {
    public static int weirdArray(int[] input,int n){
        HashMap<Integer,Integer> count=new HashMap<Integer,Integer>();
        for(int i:input){
            if(count.containsKey(i)) {
                count.put(i, count.get(i) + 1);
            }
            else{
                count.put(i,1);
            }
        }
        int maxVal=0;
        int maxValNum=0;
        for(int key:count.keySet()){
            if(count.get(key)>maxVal){
                maxVal=count.get(key);
                maxValNum=key;
            }
        }
        if(maxVal==1){
            return 0;
        }
        int result=input.length;
        int currCount=0;
        for(int i=0;i<input.length;i++){
            if(input[i]==maxValNum) {
                currCount++;
            }
            else{
                currCount=0;
            }
            if(currCount==maxVal) {
                result = Math.min(result, i + 1);
            }
        }
        return result-maxVal+1;
    }

    public static void main(String[] args) {
        int arr[]={3,3,1,3,3};
        System.out.println(weirdArray(arr,arr.length));
    }
}
