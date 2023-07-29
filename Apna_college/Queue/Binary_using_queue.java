package Apna_college.Queue;
import java.util.*;
public class Binary_using_queue {
    public static void printBinary(int n){
        Queue<String> queue=new LinkedList<>();
        queue.add("1");
        while(n -->0){
            String s1=queue.peek();
            queue.remove();
            System.out.println(s1);
            String s2=s1;
            queue.add(s1+"0");
            queue.add(s2+"1");
        }
    }

    public static void main(String[] args) {
        int n=10;
        printBinary(n);
    }
}
