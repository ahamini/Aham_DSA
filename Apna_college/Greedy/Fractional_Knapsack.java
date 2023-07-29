package Apna_college.Greedy;
import java.util.*;
public class Fractional_Knapsack {
    public static void main(String[] args) {
        int weight[]={10,20,30};
        int price[]={60,100,120};
        int cap=50,sum=0;
        double arr[][]=new double[weight.length][2];
        for(int i=0;i<arr.length;i++){
            arr[i][0]=i;
            arr[i][1]=price[i]/(double)weight[i];
        }
        Arrays.sort(arr,Comparator.comparing(o ->o[1]));
        for(int i=arr.length-1;i>=0;i--){
                int idx=(int)arr[i][0];
                if(cap>=weight[idx]){
                    sum=sum+price[idx];
                    cap=cap-weight[idx];
            }
                else{
                    sum=sum+(int)(arr[i][1]*cap);
                    cap=0;
                    break;
                }
            }
        System.out.println("the final price is"+ sum);
    }
}
