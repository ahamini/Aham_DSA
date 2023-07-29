package Apna_college.Linked_List;
import java.util.*;
public class zig_Zag_LL {
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
        Node newNode =new Node(data);
        if(head==null){
            head=tail=newNode;
            return;
        }
        tail.next=newNode;
        tail=newNode;
    }
    private Node getmid(Node head){
        Node slow=head;
        Node fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
    public void zig_zag(){
        Node mid=getmid(head);
        Node prev=null;
        Node curr=mid.next;
        mid.next=null;
        Node next;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }

        Node leftHead=head;
        Node rightHead=prev;
        Node nextL,nextR;
        while(leftHead!=null && rightHead!=null){
            nextL=leftHead.next;
            leftHead.next=rightHead;
            nextR=rightHead.next;
            rightHead.next=nextL;

            leftHead=nextL;
            rightHead=nextR;
        }
    }
    public void print(){
        if(head==null){
            System.out.println("LL is Empty");
            return;
        }
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" -> ");
            temp=temp.next;
        }
        System.out.println("NULL");
    }

    public static void main(String[] args) {
        zig_Zag_LL ll=new zig_Zag_LL();
        ll.add_last(1);
        ll.add_last(2);
        ll.add_last(3);
        ll.add_last(4);
        ll.add_last(5);
//        ll.add_last(6);
        ll.print();
        ll.zig_zag();
        ll.print();
    }
}
