package Apna_college.Binary_Tree;
import java.util.*;
public class Transfrom_to_sumTree{
    static class Node{
        int data;
        Node left,right;
        public Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    public static int sumTree(Node root){
        if(root==null){
            return 0;
        }
        int left=sumTree(root.left);
        int right=sumTree(root.right);
        int  data=root.data;
        int newLeft=root.left==null? 0:root.left.data;
        int newRight=root.right==null?0:root.right.data;
        root.data=left+newLeft+right+newRight;
        return data;
    }
    public static void PreOrder(Node root){
        if(root==null)
            return;
        System.out.println(root.data);
        PreOrder(root.left);
        PreOrder(root.right);
    }
    public static void main(String[] args) {
        Node root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.left.left=new Node(4);
        root.left.right=new Node(5);
        root.right.left=new Node(6);
        root.right.right=new Node(7);
        sumTree(root);
        PreOrder(root);
    }
        }
