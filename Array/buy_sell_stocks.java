package Array;
import java.util.*;
public class buy_sell_stocks {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the time span");
        int n=sc.nextInt();
        System.out.println("Enter the day to day price of a stock");
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int maxim[]=new int[n];
        int max[]=new int[n];
        int maxi=Integer.MIN_VALUE;
        for(int i=n-1;i>=0;i--){
            maxi=Math.max(arr[i],maxi);
            maxim[i]=maxi;
        }int profit_max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
           int profit=maxim[i]-arr[i];
           if(profit_max<profit)
               profit_max=profit;
        }
if(profit_max>=0)
    System.out.println(profit_max);
else
    System.out.println(0);
    }
}
