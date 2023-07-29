package Apna_college.Linked_List;
import java.util.*;
public class Remove_Cycle_LL {
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
    public static void remove_cycle(){
        Node slow=head;
        Node fast=head;
        boolean count=false;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                count=true;
                break;
            }
        }
        if(!count)
            return;
        slow=head;
        Node prev=null;
        while(slow!=fast) {
            slow = slow.next;
            prev = fast;
            fast = fast.next;
        }
        prev.next=null;
        }
    }

