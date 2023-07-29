package Apna_college.BST;
import java.util.*;
public class search_BST {
    static class Node{
        int data;
        Node left,right;
        public Node(int data){
            this.data=data;
        }
    }
    public static boolean Search(Node root,int key){
        if(root==null){
        return false;
        }
        if(root.data==key){
            return true;
        }
        else if(root.data>key){
            return Search(root.left,key);
        }
        else
            return Search(root.right,key);
    }

    public static void printInRange(Node root,int k1,int k2){
        if(root==null){
            return;
        }
        if(root.data>=k1 && root.data<=k2){
            printInRange(root.left,k1,k2);
            System.out.print(root.data+"  ");
            printInRange(root.right,k1,k2);
        }
        else
        if(root.data<k1) {
            printInRange(root.right, k1, k2);
        }
        else
            printInRange(root.left,k1,k2);
        }

    public static void main(String[] args) {
        Node root=new Node(5);
        root.left=new Node(2);
        root.right=new Node(6);
        root.left.right=new Node(3);
        root.left.right.right=new Node(4);
        root.right.right=new Node(7);
        System.out.println(Search(root,8));
        printInRange(root,2,7);
    }
}
