package Array;
import java.util.*;
public class pairs {
    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        while(T-->0){
            int N=sc.nextInt();
            int A[]=new int[N];
            int B[]=new int[N];
            int sum1=0;
            int sum2=0;
            for(int i=0;i<N;i++){
                A[i]=sc.nextInt();
                B[i]=sc.nextInt();
                sum1=sum1+A[i];
                sum2=sum2+B[i];
            }
            if(sum1!=sum2)
                System.out.println(-1);
            else{
                int count =0;
                for(int i=0;i<N;i++){
                    int j=i+1;
                    while(A[i]<B[i]){
                        if(A[j]>B[j]){
                            B[j]++;
                            A[i]++;
                            count++;
                        }
                        else
                            j++;
                    }
                }
                System.out.println(count);
            }
        }
    }
}
