package Apna_college.Stack;
import java.util.*;
public class Stack_JCF {
    public static void main(String[] args) {
        Stack<Integer> s=new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        System.out.println("the top is :"+s.peek());
        while(!s.isEmpty()){
            System.out.println(s.pop());
    }
    }
}
