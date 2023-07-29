package Apna_college.Linked_List;
import java.util.*;
public class palindrome_LL {
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
    public void add_las(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=tail=newNode;
            return;
        }
        tail.next=newNode;
    }
    // Slow-Fast Approach
    public Node find_mid(Node head){
        Node slow=head;
        Node fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
    public boolean checkpalinLL(){
        if(head==null ||head.next==null)
            return true;
        //find middle element
        Node mid=find_mid(head);
        //reverse 2nd half of LL
        Node prev=null;
        Node curr=mid;
        Node next;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        // compare left and right part
        Node left=head;
        Node right=prev;
        while(right!=null){
            if(right.data!=left.data)
                return false;
            right=right.next;
            left=left.next;
        }
        return true;
    }

    public static void main(String[] args) {
        palindrome_LL ll=new palindrome_LL();
        ll.add_las(1);
        ll.add_las(2);
        System.out.println(ll.checkpalinLL());
    }
}
