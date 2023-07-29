package Array;
import java.util.*;
public class maxSubarray_prefix {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length and elemnts of an Array");
        int n= sc.nextInt();
        int arr[]=new int[n];
        int prefix[]=new int[n];
        int sum_pre=0;
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
            sum_pre=sum_pre+arr[i];
            prefix[i]=sum_pre;
        }
        int max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            int low=i;
            for(int j=i;j<n;j++){
               int high=j;
              int sum=low==0? prefix[high]:prefix[high]-prefix[low-1];
               if(sum>max)
                   max=sum;
            }
        }
        System.out.println(max);
    }
}
