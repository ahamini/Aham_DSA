package Apna_college.Linked_List;
import java.util.*;
public class size_LL {
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
    public void size(){
        int count=0;
        Node temp=head;
        while(temp!=null){
            temp=temp.next;
            count++;
        }
        System.out.println("LL size is "+count);
    }

    public static void main(String[] args) {

    }
}
