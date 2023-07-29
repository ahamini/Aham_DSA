package Apna_college.Binary_Tree;
import java.util.*;
public class count_nodes {
    static class Node{
        int data;
        Node left,right;
        public Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    public static int count(Node root){
        if(root==null){
            return 0;
        }
        int c1=count(root.left);
        int c2=count(root.right);
        return c1+c2+1;
    }
    public static int sum(Node root){
        if(root==null){
            return 0;
        }
        int s1=sum(root.left);
        int s2=sum(root.right);
        return s1+s2+root.data;
    }

    public static void main(String[] args) {
        Node root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.left.left=new Node(4);
        root.left.right=new Node(5);
        root.right.right=new Node(6);
        root.right.right.left=new Node(9);
        System.out.println(count(root));
    }
}

