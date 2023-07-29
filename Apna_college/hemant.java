//Hemant TCS exam Question
package Apna_college;
import java.util.*;
public class hemant {
    public static void main(String args[]){
        Scanner sc=new Scanner (System.in);
        int N=sc.nextInt();
        int K=sc.nextInt();
        int M[]=new int[N];
        for(int i=0;i<N;i++)
            M[i]=sc.nextInt();
        while(K -->0){
            int X=sc.nextInt();
            int Y=sc.nextInt();
            M[X-1]=Y;
            int count=0;
            for(int i=0;i<N-1;i++)
                if(M[i]==M[i+1])
                    count ++;
            System.out.print(N-count+" ");
        }
    }
}
