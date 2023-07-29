package Apna_college.Heaps;
import java.util.*;
public class Priority_Queue {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        pq.add(4);
        pq.add(2);
        pq.add(1);
        pq.add(3);
        System.out.println(pq);
        while (!pq.isEmpty())
            System.out.println(pq.remove());
        PriorityQueue<Integer> pq1=new PriorityQueue<>(Comparator.reverseOrder());
        pq1.add(4);
        pq1.add(2);
        pq1.add(1);
        pq1.add(3);
        System.out.println(pq1);
        System.out.println("top most "+ pq1.peek());
        while (!pq1.isEmpty())
            System.out.println(pq1.remove());
    }
}
