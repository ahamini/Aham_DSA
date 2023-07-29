package Apna_college.Queue;
import java.util.*;
public class Queue_using_LL {
   static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    static class queue{
    public static Node head=null;
    public static Node tail=null;
    public static int size=0;

    public static boolean isEmpty(){
    return  head==null;
    }
    public static void add(int data){
        Node newNode=new Node(data);
        if(isEmpty()){
            head=tail=newNode;
            return;
        }
        tail.next=newNode;
        tail=newNode;
    }
    public static void remove(){
        if(isEmpty()){
            System.out.println("Queue is Empty");
            return;
        }
        if(head==tail){
            head=tail=null;
            return;
        }
        head=head.next;
    }
    public static int peek(){
        return head.data;
    }
    public static void print(){
        Node temp=head;
        while(temp!=null){
            System.out.println(temp.data);
            temp=temp.next;
        }
    }

        public static void main(String[] args) {
          add(1);
          add(2);
          add(3);
          print();
            System.out.println(peek());
            remove();
            print();
        }
    }
}
