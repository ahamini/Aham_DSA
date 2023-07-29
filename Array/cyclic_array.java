package Array;
import java.util.*;
public class cyclic_array {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int K=sc.nextInt();
        int arr[]=new int[N];
        for(int i=0;i<N;i++)
            arr[i]=sc.nextInt();
        for(int i=1;i<N;i++){
            if(K!=0){
                int temp=arr[i];
                arr[i]=arr[N-K];
                arr[N-K]=temp;
                K--;
            }
        }
        for(int i=0;i<N;i++)
            System.out.println(arr[i]);
    }
}
