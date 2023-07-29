package Apna_college.Binary_Tree;
import java.util.*;
public class Kth_Level {
    static class Node{
        int data;
        Node left,right;
        public Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    public static void levelPrint(Node root,int level,int K){
        if(root==null){
            return;
        }
        if(level==K){
            System.out.print(root.data);
        }
        levelPrint(root.left,level+1,K);
        levelPrint(root.right,level+1,K);
    }

    public static void main(String[] args) {
        Node root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.left.left=new Node(4);
        root.left.right=new Node(5);
        root.right.left=new Node(6);
        root.right.right=new Node(7);
        levelPrint(root,1,3);
    }
}
