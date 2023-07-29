package String;
import java.util.*;
public class Rabin_karp_algo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String pat=sc.next();
        String S=sc.next();
        ArrayList<Integer> ls =new ArrayList<>();
        ls=search(pat,S);
        System.out.println(ls);
    }
    public static ArrayList<Integer> search(String pat,String S){
        ArrayList<Integer> ls=new ArrayList<>();
        for(int i=0;i<pat.length()-S.length();i++){
            System.out.println(pat.substring(i));
            if(pat.substring(i,i+S.length()).equals(S))
                ls.add(i+1);
        }
        return ls;
    }
}
