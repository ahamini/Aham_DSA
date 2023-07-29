package Apna_college.Linked_List;
import java.util.*;
public class remove_fir {
    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=null;
        }
        public static Node head=null;
        public static Node tail=null;
        public void remove_fir(){

            head=head.next;
        }
    }
}
