package Apna_college.Stack;
import java.util.*;
public class LL_stack {
     static class Node {
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    static class Stack {
        public static Node head = null;

        public static boolean isEmpty() {
            return head == null;
        }

        public static void push(int data) {
            Node newNode = new Node(data);
            if (head == null) {
                head = newNode;
                return;
            }
            newNode.next = head;
            head = newNode;
        }

        public static int pop() {
            if (head == null) {
                return -1;
            }
            int val = head.data;
            head = head.next;
            return val;
        }

        public static int peek() {
            if (isEmpty())
                return -1;
            return head.data;
        }
    }
    public static void main(String[] args){
        Stack s=new Stack();
        Stack.push(1);
        Stack.push(2);
        Stack.push(3);
        int a=Stack.pop();
        System.out.println(a);
        int b=Stack.pop();
        System.out.println(b);
        System.out.println(Stack.peek());

    }
}
