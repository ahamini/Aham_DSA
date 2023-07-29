package Apna_college.Binary_Tree;
import java.util.*;
import java.util.*;
public class All_Duplicate_SubTrees {
    static HashMap<String,Integer> m;
    static class Node{
        int data;
        Node left,right;
        public Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    public static String Inorder(Node root){
        if(root==null){
            return null;
        }
        String str="";
        str+=Inorder(root.left);
        str+=Integer.toString(root.data);
        str+=Inorder(root.right);

        if(m.get(str)!=null && m.get(str)==1){
            System.out.print(root.data+" ");
        }
        if(m.containsKey(str)){
            m.put(str,m.get(str)+1);
        }
        else
            m.put(str,1);
        return str;
    }
    public static void duplicate(Node root){
        m=new HashMap<>();
        Inorder(root);
    }
    public static  int findmeout(int input1) {
        int ans=0;
        for (int i =1; i <=Integer.MAX_VALUE; i++) {
            int x = i;
            if (i % input1 == 0) {
                int sum = 0;
                while (x != 0) {
                    int a = x % 10;
                    sum = sum + a;
                    x = x / 10;
                }
                if (sum == input1) {
                    ans=i;
                    break;
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Node root = null;
        root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(1);
        root.left.left = new Node(4);
        root.right.left = new Node(2);
        root.right.left.left = new Node(4);
        root.right.right = new Node(4);
        System.out.println(findmeout(10));
    }
}
