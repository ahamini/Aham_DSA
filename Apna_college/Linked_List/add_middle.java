package Apna_college.Linked_List;
import java.util.*;
public class add_middle {
    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=null;
        }
        public static Node head=null;
        public static Node tail=null;
        public void add_mid(int index,int data){
            Node newNode=new Node(data);
            int i=0;
            Node temp=head;
            while(i<index-1){
                temp=temp.next;
                i++;
            }
            newNode.next=temp.next;
            temp.next=newNode;
        }
    }
}
