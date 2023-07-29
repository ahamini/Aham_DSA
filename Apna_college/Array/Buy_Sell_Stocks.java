package Apna_college.Array;
import java.util.*;
public class Buy_Sell_Stocks {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();
        int maxim[]=new int[n];
        int max=Integer.MIN_VALUE;
        for(int i=n-1;i>=0;i--){
            max=Math.max(max,arr[i]);
            maxim[i]=max;
        }
        int result=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            int a=maxim[i]-arr[i];
            result=Math.max(result,a);
        }
        System.out.println(result);
    }
}
