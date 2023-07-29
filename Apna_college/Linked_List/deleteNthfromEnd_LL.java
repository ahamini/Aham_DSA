package Apna_college.Linked_List;
import java.util.*;
public class deleteNthfromEnd_LL {
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
    public void deleteNthFromEnd(int n){
        int size=0;
        Node temp=head;
        while (temp!=null){
            temp=temp.next;
            size++;
        }
        if(n==size){
            head=head.next;
            return;
        }
        int i=1;
        int size_to=size-n;
        Node prev=head;
        while(i<size_to){
            prev=prev.next;
            i++;
        }
        prev.next=prev.next.next;
        return;
    }
}
