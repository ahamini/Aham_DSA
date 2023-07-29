package Apna_college.BST;
import java.util.*;
public class build_BST {
    static class Node{
        int data;
        Node left,right;
        public Node(int data){
            this.data=data;
        }
    }
    public static Node build(Node root,int val){
        if(root==null){
            root=new Node(val);
            return root;
        }
        if(root.data>val){
           root.left= build(root.left,val);
        }
        else if(root.data<val){
            root.right=build(root.right,val);
        }
        return root;
    }
  public static void Inorder(Node root){
        if(root==null){
            return;
        }
        Inorder(root.left);
      System.out.println(root.data+ " ");
      Inorder(root.right);
  }
  public static boolean validBST(Node root,Node min,Node max){
        if(root==null){
            return true;
        }
        if(min!=null && root.data<=min.data){
            return false;
        }
        else if(max!=null && root.data>=max.data){
            return false;
        }
        return validBST(root.left,min,root) &&
        validBST(root.right,root,max);
  }
    public static Node mirrorBST(Node root){
        if(root==null){
            return null;
        }
        Node temp=root.left;
        root.left=root.right;
        root.right=temp;
        mirrorBST(root.left);
        mirrorBST(root.right);
        return root;
    }
    public static void main(String[] args) {
        int arr[]={5,1,3,4,2,7};
        Node root=null;
        for(int i=0;i<arr.length;i++) {
            root = build(root, arr[i]);
        }
        Inorder(root);
        System.out.println( validBST(root,null,null));
        mirrorBST(root);
        Inorder(root);
        System.out.println( validBST(root,null,null));
    }

}
