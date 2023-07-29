package Apna_college.Linked_List;
import java.util.*;
 class Add_first_LL {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
        public static Node head=null;
        public static Node tail=null;
        public void add_first(int data){
            Node newNode=new Node(data);
            if(head==null){
                head=tail=newNode;
                return;
            }
            newNode.next=head;
            head=newNode;
        }
    public static void main(String[] args) {
        Add_first_LL ll=new Add_first_LL();
        ll.add_first(2);
        ll.add_first(1);
        ll.add_first(0);
    }
}
