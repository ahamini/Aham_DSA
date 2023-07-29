package Apna_college.Queue;
import java.util.*;
public class Stack_Using_Deque {
    static class stack {
        Deque<Integer> dq = new LinkedList<>();

        public void push(int data) {
            dq.addLast(data);
        }

        public int pop() {
            return dq.removeLast();
        }

        public int peek() {
            return dq.getLast();
        }
    }
        public static void main(String[] args) {
             stack s =new stack();
             s.push(1);
             s.push(2);
            System.out.println(s.peek());
            s.pop();
            System.out.println(s.peek());

        }
    }

