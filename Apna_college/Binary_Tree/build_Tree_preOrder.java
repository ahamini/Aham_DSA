package Apna_college.Binary_Tree;
import java.util.*;
public class build_Tree_preOrder {
    static class Node{
        int data;
        Node left;
        Node right;
        public Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    static class Binary_tree{
       static int idx=-1;
        public static  Node buildPreOrder(int arr[]){
             idx++;
            if(arr[idx]==-1){
                return null;
            }
            Node newNode=new Node(arr[idx]);
            newNode.left=buildPreOrder(arr);
            newNode.right=buildPreOrder(arr);
            return newNode;
        }
    }
    public static void main(String[] args) {
        int arr[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        Binary_tree bt=new Binary_tree();
        Node root= Binary_tree.buildPreOrder(arr);
        System.out.println(root.data);
    }
}
