package Apna_college.Linked_List;
import java.util.*;
public class print_LL {
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
    public static int size=0;
    public void add_fir(int data){
        Node newNode =new Node(data);
        if(head==null){
            head=tail=newNode;
            size++;
            return;
        }
        newNode.next=head;
        head=newNode;
        size++;
    }

    public void add_las(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=tail=newNode;
            size++;
        }
        tail.next=newNode;
        tail=newNode;
        size++;
    }
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
        size++;
    }
    public void print(){
        if(head==null){
            System.out.println("LL is Empty");
            return;
        }
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("NULL");
    }
    public void size(){
        System.out.println("LL size is "+size);
    }
    public void remove_fir(){
        if(size==0){
            System.out.println("LL is Empty");
            return;
        }
        if(size==1){
            head=tail=null;
            size=0;
            return;
        }
        head=head.next;
        size--;
    }
    public void remove_las(){
        if(size==0){
            System.out.println("LL is Empty");
            return;
        }
        if(size==1){
            head=tail=null;
            size=0;
            return;
        }
        Node prev=head;
        for(int i=0;i<size-2;i++){
            prev=prev.next;
        }
        prev.next=null;
        tail=prev;
        size--;
    }

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
    public int recursive_serch(Node head, int x,int i){
        if(head==null)
            return -1;
        if(head.data==x)
            return i;
        return recursive_serch(head.next,x,i+1);
    }
    public void reverse(){
        Node prev=null;
        Node  curr=tail=head;
        Node next;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        head=prev;
    }

    public void deleteNthFromEnd(int n){
        int sizer=0;
        Node temp=head;
        while (temp!=null){
            temp=temp.next;
            sizer++;
        }
        if(n==sizer){
            head=head.next;
            size--;
            return;
        }
        int i=1;
        int size_to=sizer-n;
        Node prev=head;
        while(i<size_to){
            prev=prev.next;
            i++;
        }
        prev.next=prev.next.next;
        size--;
        return;
    }
    public static void main(String[] args) {
        print_LL ll=new print_LL();
        ll.print();
        ll.add_fir(2);
        ll.print();
        ll.add_fir(1);
        ll.print();
        ll.add_las(3);
        ll.print();
        ll.add_las(4);
        ll.print();
        ll.add_las(5);
        ll.print();
        ll.size();
        ll.add_mid(3,9);
        ll.print();
        ll.add_mid(0,12);
        ll.print();
        ll.size();
        ll.remove_fir();
        ll.print();
        ll.size();
        ll.remove_las();
        ll.print();
        ll.size();
        System.out.println(ll.iterative_sear(3));
        System.out.println(ll.iterative_sear(15));
        System.out.println(ll.recursive_serch(head,3,0));
        System.out.println(ll.recursive_serch(head,9,0));
        ll.reverse();
        ll.print();
        ll.deleteNthFromEnd(4);
        ll.print();
        ll.size();

    }
}
