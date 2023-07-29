package Apna_college.Linked_List;
import java.util.*;
public class doubly_LL {
    public static class Node{
        int data;
        Node next;
        Node prev;
        public Node(int data){
            this.data=data;
            this.next=null;
            this.prev=null;
        }
    }
    public static Node head=null;
    public static Node tail=null;
    public static int size;

    public void add_First(int data){
    Node newNode=new Node(data);
    size++;
    if(head==null){
        head=tail=newNode;
        return;
    }
    newNode.next=head;
    head.prev=newNode;
    head=newNode;
 }
 public int remove_First(){
        if(head==null){
            System.out.println("DLL is Empty");
            return Integer.MIN_VALUE;
        }
        if(size==1){
            int val= head.data;
            head=tail=null;
            size--;
            return val;
        }
        int val= head.data;
        head=head.next;
        head.prev=null;
        size--;
        return val;
 }
 public void add_last(int data){
        Node newNode=new Node(data);
        size++;
        if(head==null){
            head=tail=newNode;
            return;
        }
        tail.next=newNode;
        newNode.prev=tail;
        tail=newNode;
 }
 public int remove_last(){
        if(head==null){
            System.out.println("DLL is Empty");
            size--;
            return Integer.MIN_VALUE;
        }
        if(size==1){
            int val=head.data;
            head=tail=null;
            size--;
            return val;
        }
        int val=tail.data;
        Node temp=tail.prev;
        temp.next=null;
        tail=temp;
        size--;
        return val;
 }
 public void reverse(){
        Node curr=head;
        Node prev=null;
        Node next;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            curr.prev=next;
            prev=curr;
            curr=next;
        }
        head=prev;
 }
 public void print(){
        if(head==null){
            System.out.println("DLL is Empty");
            return;
        }
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"<->");
            temp=temp.next;
        }
     System.out.println("NULL");
 }
    public static void main(String[] args) {
        doubly_LL ll=new doubly_LL();
        ll.add_First(3);
        ll.add_First(2);
        ll.add_First(1);
        ll.add_First(0);
        ll.print();
        System.out.println(ll.size);
       int x= ll.remove_First();
        System.out.println(x);
        ll.print();
        System.out.println(ll.size);
        ll.add_last(4);
        ll.add_last(5);
        ll.print();
        System.out.println(ll.size);
        ll.remove_last();
        ll.remove_last();
        ll.print();
        ll.reverse();
        ll.print();
    }
}
