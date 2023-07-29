package Apna_college.Linked_List;
import java.util.*;
public class Add_last {
    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static Node head=null;
    public static Node tail=null;
    public void add_last(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=tail=newNode;
            return;
        }
        tail.next=newNode;
        tail=newNode;
    }
    public static boolean isCycle() {
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast)
                return true;
        }
        return false;
    }
    public static void remove_cycle(){
        Node slow=head;
        Node fast=head;
        boolean count=false;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                count=true;
                break;
            }
        }
        if(!count)
            return;
        slow=head;
        Node prev=null;
        while(slow!=fast) {
            slow = slow.next;
            prev = fast;
            fast = fast.next;
        }
        prev.next=null;
    }

    public static void main(String[] args) {
        head=new Node(1);
        Node temp=new Node(2);
        head.next=temp;
        head.next.next=new Node(3);
        head.next.next.next=temp;
        System.out.println(isCycle());
        remove_cycle();
        System.out.println(isCycle());
    }
}
