package Apna_college.Linked_List;
import java.util.*;
public class retain_M_delete_N_LL {
    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=null;
        }
        public static Node head=null;
        public static Node tail=null;
        public static void add_last(int data){
            Node newNode=new Node(data);
            if(head==null){
                head=tail=newNode;
                return;
            }
            tail.next=newNode;
            tail=newNode;
        }
        public static void operation(int M,int N){
            Node temp=head;
             while(temp!=null){
                 int a=M;
                 int b=N;
                 Node prev=null,next1=null;
                 while(a>0 && temp!=null){
                     prev=temp;
                     temp=temp.next;
                     a--;
                 }
                 while(b>0 && temp!=null){
                     next1=temp;
                     temp=temp.next;
                     b--;
                 }
                 prev.next=next1.next;
             }
        }
       public static void print(){
            if(head==null){
                System.out.println("LL is Empty");
                return;
            }
            Node temp=head;
            while(temp!=null){
                System.out.print(temp.data+"->");
                temp=temp.next;
            }
           System.out.println("null");
       }
        public static void main(String[] args) {
            retain_M_delete_N_LL ll=new retain_M_delete_N_LL();
            add_last(1);
            add_last(2);
            add_last(3);
            add_last(4);
            add_last(5);
            add_last(6);
            add_last(7);
            add_last(8);
            add_last(9);
            add_last(10);
            print();
            operation(3,2);
            print();
        }
    }
}
