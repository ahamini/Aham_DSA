package Apna_college.Linked_List;
import java.util.*;
public class inbuilt_LL {
    public static void main(String[] args) {
        LinkedList<Integer> ll=new LinkedList<>();
        ll.addFirst(1);
        ll.addLast(2);
        ll.addFirst(0);
        System.out.println(ll);
        ll.remove();
        System.out.println(ll);
        ll.removeFirst();
        System.out.println(ll);
    }
}
