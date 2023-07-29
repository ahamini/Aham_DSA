package Apna_college.Greedy;
import java.util.*;
public class max_len_Chain {
    public static void main(String[] args) {
        int pair[][]={{5,24},{39,60},{5,28},{27,40},{50,90}};
        Arrays.sort(pair,Comparator.comparing(o->o[1]));
        int result=1;
        int lastEnd=pair[0][1];
        for (int i=1;i<pair.length;i++){
            if(pair[i][0]>lastEnd){
                result++;
                lastEnd=pair[i][1];
            }
        }
        System.out.println("the chain length is "+result);
    }
}
