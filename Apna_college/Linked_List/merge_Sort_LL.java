package Apna_college.Linked_List;
import java.util.*;
public class merge_Sort_LL{
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public static Node head = null;
    public static Node tail = null;

    public  void add_last(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
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
    public Node getmid(Node head){
        Node slow=head;
        Node fast=head.next;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
    public Node merge(Node head1, Node head2){
        Node mergeLL=new Node(-1);
        Node temp=mergeLL;
        while(head1!=null && head2!=null){
            if(head1.data<=head2.data){
                temp.next=head1;
                head1=head1.next;
                temp=temp.next;
            }
            else{
                temp.next=head2;
                head2=head2.next;
                temp=temp.next;
            }
        }
        while(head1!=null){
            temp.next=head1;
            head1=head1.next;
            temp=temp.next;
        }
        while(head2!=null){
            temp.next=head2;
            head2=head2.next;
            temp=temp.next;
        }
        return mergeLL.next;
    }
    public Node merge_sort(Node head){
        if(head==null || head.next==null)
            return head;
        //mid
       Node mid=getmid(head);
        //left and right MS
        Node rightHead=mid.next;
        mid.next=null;
        Node newLeft= merge_sort(head);
        Node newRight=merge_sort(rightHead);
        //merge
        return merge(newLeft,newRight);


    }
    public static void main(String[] args){
        merge_Sort_LL ll=new merge_Sort_LL();
        ll.add_last(2);
        ll.add_last(1);
        ll.add_last(4);
        ll.add_last(5);
        ll.add_last(3);
        ll.print();
        ll.head=ll.merge_sort(ll.head);
        ll.print();
    }
}
