package Apna_college.Linked_List;
import java.util.*;
public class remove_las {
    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=null;
        }
        public static Node head=null;
        public static Node tail=null;
        public void remove_las(){
            if(head==null){
                System.out.println("LL is Empty");
                return;
            }
            Node temp=head;
            while(temp.next!=null){
                temp=temp.next;
            }
        }
    }
}
