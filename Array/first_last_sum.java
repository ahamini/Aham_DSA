package Array;
import java.util.*;
public class first_last_sum {
    public static String num(int arr[],int n){
        int sum=0;
        for(int i=0;i<n;i++)
        sum=sum+arr[i];
      int sum1=arr[0];
      for(int i=1;i<n-1;i++){
         int sum2=sum-sum1-arr[i];
          if(sum2==sum1)
              return "YES";
          sum1=sum1+arr[i];
      }
      return "NO";
    }

    public static void main(String[] args) {
        int arr[]={0,2,3,4,5,9};
        System.out.println(num(arr,arr.length));
    }
}
