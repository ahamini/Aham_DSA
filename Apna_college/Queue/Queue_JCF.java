package Apna_college.Queue;
import java.util.*;
public class Queue_JCF {
    public static void main(String[] args) {
        Queue<Integer> qs=new LinkedList<>();
        qs.add(1);
        qs.add(2);
        qs.add(3);
        System.out.println(qs);
        qs.peek();
        qs.remove();
        System.out.println(qs);

    }
}
