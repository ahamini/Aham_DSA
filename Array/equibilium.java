package Array;

public class equibilium {
    public static int equilibriumPoint(long arr[], int n) {
        if(arr.length==1)
            return 1;

        else if(arr.length==2)
            return -1;

        else{
            int index=0;
           long  sum1=0;
            for(int equi=0;equi<=n-2;equi++){
                sum1=sum1+arr[equi];
               long sum2=0;
                index=equi+1;
                for(int i=equi+1;i<n;i++)
                    sum2=sum2+arr[equi];
                System.out.println(sum1);
                System.out.println(sum2);
                if(sum1==sum2){
                    System.out.println(sum1);
                    System.out.println(sum2);
                    System.out.println(index);
                    break;
                }
            }
            return index;
        }
    }

    public static void main(String[] args) {
        long arr[]={1,3,5,2,2};
       int ind= equilibriumPoint(arr,5);
        System.out.println(ind);
    }
}
