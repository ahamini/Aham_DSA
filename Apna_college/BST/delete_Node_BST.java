package Apna_college.BST;
import java.util.*;
public class delete_Node_BST {
    static class Node{
        int data;
        Node left,right;
        public Node(int data){
            this.data=data;
        }
    }
    public static Node delete(Node root,int val) {
        if (root.data > val) {
            root.left = delete(root.left, val);
        } else if (root.data < val) {
            root.left = delete(root.right, val);
        } else {
            if (root.left == null && root.right == null) {
                return null;
            }
            if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            }
            Node IS = InorderSuccessor(root.right);
            root.data = IS.data;
            root.right = delete(root.right, IS.data);
        }
        return root;
    }
        public static Node InorderSuccessor(Node root){
            while(root.left!=null){
                root=root.left;
            }
            return root;
        }
        public static Node build(Node root,int val){
        if(root==null){
            root=new Node(val);
            return root;
        }
        if(root.data>val){
            root.left=build(root.left,val);
        }
        else if(root.data<val){
            root.right=build(root.right,val);
        }
        return root;
        }
        public static void InOrder(Node root){
        if(root==null){
            return;
        }
        InOrder(root.left);
            System.out.print(root.data +" ");
            InOrder(root.right);
        }
    public static void main(String[] args) {
        int arr[]={8,5,3,1,4,6,10,11,14};
        Node root=null;
        for(int i=0;i<arr.length;i++){
            root=build(root,arr[i]);
        }
        InOrder(root);
        System.out.println();
        delete(root,5);
        InOrder(root);
    }
}
