package Array;
import java.util.*;
public class xor {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int Q=sc.nextInt();
        int arr[]=new int[N];
        int ans[]=new int[Q];
        for(int i=0;i<N;i++)
            arr[i]=sc.nextInt();
        for(int i=0;i<Q;i++){
            int L=sc.nextInt();
            int R=sc.nextInt();
            int X=sc.nextInt();
            int sum=0;
            for(int j=L-1;j<R;j++){
                sum=sum+XOR(arr[j],X);
                System.out.println(sum);
            }
            ans[i]=sum;

        }
        for(int i=0;i<Q;i++)
            System.out.println(ans[i]);
    }
    static int XOR(int x, int y)
    {
        return (x & (~y)) | ((~x )& y);
    }
    }

