package Apna_college.Queue;
import java.util.*;
public class reverse_K_elment {
    public static void main(String[] args) {
        Queue<Integer> q=new LinkedList<>();
        Stack<Integer> s=new Stack<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);
        q.add(7);
        q.add(8);
        q.add(9);
        q.add(10);
        int n=5;
        int size=q.size()-n;
        System.out.println(q);
        for(int i=0;i<n;i++){
            s.add(q.remove());
        }
        while(!s.isEmpty()){
            q.add(s.pop());
        }
        for(int i=0;i<size;i++){
            q.add(q.remove());
        }
        System.out.println(q);
    }
}
