package Apna_college.Binary_Tree;
import java.util.*;
public class distance_betwenn_2_nodes {
    static class Node{
        int data;
        Node left,right;
        public Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    public static Node LCA(Node root,int n1,int n2){
        if(root==null || root.data==n1 ||root.data==n2){
            return root;
        }
        Node left=LCA(root.left,n1,n2);
        Node right=LCA(root.right,n1,n2);
        if(left==null)
            return right;
        if(right==null)
            return left;
        return root;
    }
    public static int lcaDist(Node root,int n){
        if(root==null){
            return -1;
        }
        if(root.data==n){
            return 0;
        }
       int left= lcaDist(root.left,n);
       int right= lcaDist(root.right,n);
       if(left==-1 && right==-1) {
           return -1;
       }
       else if(left==-1){
           return right+1;
       }
       else return left+1;
    }
    public static int TotalDist(Node root,int n1,int n2){
        Node lca=LCA(root,n1,n2);
        int dist1=lcaDist(lca,n1);
        int dist2=lcaDist(lca,n2);
        return dist1+dist2;
    }

    public static void main(String[] args) {
        Node root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.left.left=new Node(4);
        root.left.right=new Node(5);
        root.right.left=new Node(6);
        root.right.right=new Node(7);

        System.out.println(TotalDist(root,4,7));
    }
}
