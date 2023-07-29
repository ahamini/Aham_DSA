package Apna_college.Stack;
import java.util.*;
public class push_stack_Bottom {
    public static void pushBottom(Stack<Integer> s,int n){
        if(s.isEmpty()){
            s.push(n);
            return;
        }
        int top= s.pop();
        pushBottom(s,n);
        s.push(top);
    }
    public static void main(String[] args) {
        Stack<Integer> s=new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        pushBottom(s,4);
        while(!s.isEmpty()){
            System.out.println(s.pop());
        }
    }
}
