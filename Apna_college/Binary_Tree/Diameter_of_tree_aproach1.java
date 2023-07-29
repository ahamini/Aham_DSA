package Apna_college.Binary_Tree;
import java.util.*;
public class Diameter_of_tree_aproach1 {
    static class Node{
        int data;
        Node left,right;
        public Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    public static int height(Node root){
        if(root==null){
            return 0;
        }
        int leftH=height(root.left);
        int rightH=height(root.right);
        return Math.max(leftH,rightH)+1;
    }//O(n*n)
    public static int diameter(Node root){
        if(root==null)
            return 0;
        int leftD=diameter(root.left);
        int leftH=height(root.left);
        int rightD=diameter(root.right);
        int rightH=height(root.right);
        int selfD=leftH+rightH+1;
        return Math.max(selfD,Math.max(leftD,rightD));
    }
    static class Info{
        int diam;
        int hiag;
        public Info(int diam,int hiag){
            this.diam=diam;
            this.hiag=hiag;
        }
    }
    public static Info diameter2(Node root){
        if(root==null){
            return new Info(0,0);
        }
        Info leftInfo=diameter2(root.left);
        Info rightInfo=diameter2(root.right);
        int diam=Math.max(Math.max(leftInfo.diam, rightInfo.diam),leftInfo.hiag+rightInfo.hiag+1);
        int height=Math.max(leftInfo.hiag,rightInfo.hiag)+1;
        return new Info(diam,height);
    }

    public static void main(String[] args) {
        Node root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.left.left=new Node(4);
        root.left.right=new Node(5);
        root.right.right=new Node(6);
        root.right.right.left=new Node(9);
        System.out.println(diameter(root));
        Info ans=diameter2(root);
        System.out.println(ans.diam);
    }
}
