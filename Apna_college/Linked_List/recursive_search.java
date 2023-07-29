package Apna_college.Linked_List;
import java.util.*;
public class recursive_search {
    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=null;
        }
        public static Node head=null;
        public static Node tail=null;
        public static int size=0;
        public int recursive_serch(Node head,int x,int i){
            if(head==null)
                return -1;
            if(head.data==x)
                return i;
             return recursive_serch(head.next,x,i+1);
        }

    }
}
