package Apna_college.BST;
import java.util.*;
public class sortArr_to_BST {
    static class Node{
        int data;
        Node left,right;
        public Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    public static void print(Node root){
        if(root==null)
            return;
        print(root.left);
        System.out.print(root.data+" ");
        print(root.right);
    }
    public static Node convert(int arr[], int low, int high){
          if(low>high)
              return null;
          int mid=(low+high)/2;
          Node root=new Node(arr[mid]);
          root.left=convert(arr,low,mid-1);
          root.right=convert(arr,mid+1,high);

          return root;
    }

    public static void main(String[] args) {
        int arr[]={1,3,4,5,6,7,8};
        Node root=convert(arr,0,arr.length-1);
        print(root);
    }
}
