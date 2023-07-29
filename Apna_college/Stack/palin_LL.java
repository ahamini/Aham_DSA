package Apna_college.Stack;
import java.util.*;
public class palin_LL {
    public static void main(String[] args) {
        LinkedList<Integer> ls=new LinkedList<>();
        ls.addLast(1);
        ls.addLast(2);
        ls.addLast(2);
        ls.addLast(2);
        Stack<Integer> s=new Stack<>();
        int arr[]=new int[ls.size()];
        int i=-1,j=-1,count=0;
        while(!ls.isEmpty()){
            arr[++i]=ls.remove();
            s.push(arr[i]);
        }
        i=0;
        while(!s.isEmpty()){
            if(s.pop()!=arr[i++])
                count++;
        }
        if(count==0)
            System.out.println("palin");
        else
            System.out.println("not palin");

    }
}
