package Apna_college.Queue;
import java.util.*;
public class Dequue {
    public static void main(String[] args) {
        Deque<Integer> deque =new LinkedList<>();
        deque.addFirst(1);
        deque.addLast(2);
        deque.addLast(3);
        System.out.println(deque);
        System.out.println(deque.getFirst());
        deque.getLast();
        deque.removeFirst();
        deque.removeLast();
        System.out.println(deque);
    }
}
