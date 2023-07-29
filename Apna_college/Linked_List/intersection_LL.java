package Apna_college.Linked_List;
import java.sql.SQLOutput;
import java.util.*;
public class intersection_LL {
    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=null;
        }
        public static Node getNode(Node head1,Node head2) {
            while (head2 != null) {
                Node temp = head1;
                while (temp != null) {
                    if (temp == head2)
                        return head2;
                    temp = temp.next;
                }
                head2 = head2.next;
            }
            return null;
        }

        public static void main(String[] args) {
            Node head1,head2;
            head1=new Node(1);
            head2=new Node(4);

            Node newNode=new Node(2);
            head1.next=newNode;

            newNode=new Node(3);
            head1.next.next=newNode;

            newNode=new Node(6);
            head1.next.next.next=newNode;

            newNode=new Node(7);
            head1.next.next.next.next=newNode;

            newNode=new Node(5);
            head2.next=newNode;

            head2.next.next= head1.next.next.next;

            Node Intersection=getNode(head1,head2);
            if(Intersection==null) {
                System.out.println("not found");
            }
                else{
                    System.out.println("the intersection point is"+ Intersection.data);
                }
            }

        }
    }

