package Apna_college.Binary_Tree;
import java.util.*;
public class lowest_common_anscester {
    static class Node{
        int data;
        Node left,right;
        public Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    public static boolean getpath(Node root,int n,ArrayList<Node> path) {
        if (root == null){
            return false;
    }
        path.add(root);
        if(root.data==n)
            return true;
        boolean getLeft=getpath(root.left,n,path);
        boolean getright=getpath(root.right,n,path);

        if(getLeft || getright){
            return true;
        }
        path.remove(path.size()-1);
        return false;
    }
    public static Node lca(Node root,int a,int b){
        ArrayList<Node> path1=new ArrayList<>();
        ArrayList<Node> path2=new ArrayList<>();

        getpath(root,a,path1);
        getpath(root,b,path2);

        int i=0;
        while(i<path1.size() && i<path2.size()){
            if(path1.get(i).data!=path2.get(i).data)
                break;
            i++;
        }
        return path1.get(i-1);
    }
  public static Node LCA_Approach2(Node root,int a,int b){
        if(root==null || root.data==a || root.data==b){
            return root;
        }
       Node left= LCA_Approach2(root.left,a,b);
        Node right=LCA_Approach2(root.right,a,b);
        if(right==null)
            return left;
        if(left==null)
            return right;
        return root;
  }
    public static void main(String[] args) {
        Node root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.left.left=new Node(4);
        root.left.right=new Node(5);
        root.right.left=new Node(6);
        root.right.right=new Node(7);

        System.out.println(lca(root,4,7).data);
    }
}
