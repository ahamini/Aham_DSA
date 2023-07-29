package Apna_college.BST;
import java.util.*;
public class print_PAths {
    static class Node{
        int data;
        Node left,right;
        public Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    public static Node build_BST(Node root,int val){
        if(root==null){
            root=new Node(val);
            return root;
        }
        if(root.data>val){
            root.left=build_BST(root.left,val);
        }
        else if(root.data<val){
            root.right=build_BST(root.right,val);
        }
        return root;
    }
    public static void print(ArrayList<Integer> path){
        int i=0;
        while(i<path.size()){
            System.out.print(path.get(i)+"->");
            i++;
        }
        System.out.println("null");
    }
    public static void printPaths(Node root, ArrayList<Integer> path){
        if(root==null){
            return;
        }
        path.add(root.data);
        if(root.left==null && root.right==null){
            print(path);
        }
        printPaths(root.left,path);
        printPaths(root.right,path);
        path.remove(path.size()-1);
    }

    public static void main(String[] args) {
        int arr[]={8,5,3,1,4,6,10,11,14};
        Node root=null;
        for(int i=0;i<arr.length;i++){
            root=build_BST(root,arr[i]);
        }
        ArrayList<Integer> path=new ArrayList<>();
        printPaths(root,path);
    }
}
