package Apna_college.Linked_List;
import java.util.*;
public class iterative_search {
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
           public static int size=0;
           public int  iterative_sear(int x){
               Node temp=head;
               int i=0;
               while(temp!=null){
                   if(temp.data==x)
                       return i;
                   temp=temp.next;
                   i++;
               }
               return -1;
       }
}
