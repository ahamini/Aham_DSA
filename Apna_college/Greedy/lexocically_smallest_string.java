package Apna_college.Greedy;
import java.util.*;
public class lexocically_smallest_string {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int K=sc.nextInt();
        String s="";
        for(int i=26;i>=2;i--){
            if(K>=i && s.length()+(K-i)+1>=N){
                K=K-i;
                s=(char)(97+i-1)+s;
                i++;
            }
        }
        while(K>0){
            s='a'+s;
            K--;
        }
        System.out.println(s);
    }
}
