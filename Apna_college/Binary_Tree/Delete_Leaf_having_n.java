package Apna_college.Binary_Tree;
import java.util.*;
public class Delete_Leaf_having_n {
    static class Node{
        int data;
        Node left,right;
        public Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    public static Node deleteLeaf(Node root,int n){
        if(root==null)
            return null;
        root.left=deleteLeaf(root.left,n);
        root.right=deleteLeaf(root.right,n);
        if(root.left==null && root.right==null && root.data==n){
            return null;
        }
        return root;
    }
    public static void Inorder(Node root){
        if(root==null){
            return ;
        }
        Inorder(root.left);
        System.out.print(root.data+" ");
        Inorder(root.right);
    }

    public static void main(String[] args) {
        Node root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.left.left=new Node(3);
        root.left.right=new Node(5);
        root.right.left=new Node(3);
        root.right.right=new Node(7);
        Inorder(root);
        deleteLeaf(root,3);
        System.out.println();
        Inorder(root);
    }
}
