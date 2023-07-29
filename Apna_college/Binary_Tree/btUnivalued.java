package Apna_college.Binary_Tree;
import java.util.*;
public class btUnivalued {
    static class Node{
        int data;
        Node left,right;
        public Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    public static boolean isUnivalued(Node root,int n){
        if(root==null){
            return true;
        }
        if(root.data!=n){
            return false;
        }
        return isUnivalued(root.left,n) &&  isUnivalued(root.right,n);
    }

    public static void main(String[] args) {
        Node root = new Node(2);
        root.left = new Node(2);
        root.right = new Node(2);
        root.left.left = new Node(2);
        root.left.right = new Node(2);
        root.right = new Node(2);
        root.right.right = new Node(2);
        if(isUnivalued(root,2)){
            System.out.println("YES");
        }
        else
            System.out.println("NO");
    }
}
