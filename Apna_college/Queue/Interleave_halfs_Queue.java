package Apna_college.Queue;
import java.util.*;
public class Interleave_halfs_Queue {
    public static void main(String[] args) {
        Queue<Integer> q=new LinkedList<>();
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
        int size=q.size()/2;
        Queue<Integer> first=new LinkedList<>();
        while(size>0){
            first.add(q.remove());
            size--;
        }
        while(!first.isEmpty()){
            q.add(first.remove());
            q.add(q.remove());
        }
        System.out.println(q);
    }
}
