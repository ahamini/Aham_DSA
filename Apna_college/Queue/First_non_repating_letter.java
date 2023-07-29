package Apna_college.Queue;
import java.util.*;
public class First_non_repating_letter {
    public static void main(String[] args) {
        int freq[]=new int[26];
        String str="aabccxb";
        Queue<Character> q=new LinkedList<>();
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            q.add(ch);
            freq[ch-'a']++;

            while(!q.isEmpty() && freq[q.peek()-'a']>1){
                q.remove();
            }
            if(q.isEmpty()){
                System.out.println("-1");
            }
            else{
                System.out.println(q.peek());
            }
        }
    }
}
