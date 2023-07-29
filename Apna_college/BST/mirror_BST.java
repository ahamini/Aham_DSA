package Apna_college.BST;
import java.util.*;
public class mirror_BST {
    static class Node{
        int data;
        Node left,right;
        public Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    public static void mirror(Node root) {
        if (root == null){
            return;
    }
        Node temp=root.left;
        root.left=root.right;
        root.right=temp;
        mirror(root.left);
        mirror(root.right);
    }
 public static void print(Node root){
        if(root==null)
            return ;
     print(root.left);
     System.out.print(root.data+" ");
     print(root.right);
 }
    public static void main(String[] args) {
        Node root=new Node(5);
        root.left=new Node(3);
        root.left.left=new Node(1);
        root.left.right=new Node(4);
        root.right=new Node(7);
        root.right.left=new Node(6);
        root.right.right=new Node(8);
        print(root);
        mirror(root);
        System.out.println();
        print(root);
    }
}
