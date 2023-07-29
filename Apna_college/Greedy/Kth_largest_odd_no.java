package Apna_college.Greedy;
import java.util.*;
public class Kth_largest_odd_no {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int L=sc.nextInt();
        int R=sc.nextInt();
        int K=sc.nextInt();
        ArrayList<Integer> ls=new ArrayList<>();
        for(int i=R;i>=L;i--){
            if(i%2!=0)
                ls.add(i);
        }
        if(ls.size()<K)
            System.out.println(0);
        else{
            System.out.println(ls.get(K-1));
        }

        //O(1)-Time Complexity
        if(K<=0)
            System.out.println(0);
        else{
            if(R%2!=0){
                int c1=(int)Math.ceil((R-L+1)/2);
                if(K>c1)
                    System.out.println(0);
                else
                    System.out.println(R-K*2+2);
            }
            else{
                int c1=(int)Math.floor((R-L+1)/2);
                if(K>c1)
                    System.out.println(0);
                else
                    System.out.println(R-K*2+1);
            }
        }
    }
}
