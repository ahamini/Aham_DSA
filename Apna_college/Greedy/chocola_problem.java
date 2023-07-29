package Apna_college.Greedy;
import java.util.*;
public class chocola_problem {
    public static void main(String[] args) {
        int n=4,m=6;
        Integer[] horPrice={2,1,3,1,4};
        Integer[] verPrice={4,1,2};
        Arrays.sort(horPrice,Collections.reverseOrder());
        Arrays.sort(verPrice,Collections.reverseOrder());
        int h=0,v=0;
        int hp=1,vp=1;
        int cost=0;
        while(h<horPrice.length && v<verPrice.length){
            if(horPrice[h]>=verPrice[v]){
                cost+=horPrice[h]*vp;
                hp++;
                h++;
            }
            else{
                cost+=verPrice[v]*hp;
                vp++;
                v++;
            }
        }
        while(h< horPrice.length){
            cost+=horPrice[h]*vp;
            hp++;
            h++;
        }
        while(v<verPrice.length){
            cost+=verPrice[v]*hp;
            vp++;
            v++;
        }
        System.out.println("the min cost of cuts is : "+cost);
    }
}
