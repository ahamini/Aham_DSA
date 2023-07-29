package Apna_college.Stack;
import java.util.*;
public class reverse_Stack {
    public static void pushBottom(Stack<Integer> s,int n){
        if(s.isEmpty()){
            s.push(n);
            return;
        }
        int top= s.pop();
        pushBottom(s,n);
        s.push(top);
    }
    public static void reverse(Stack<Integer> s) {
        if(s.isEmpty())
            return;
        int top=s.pop();
        reverse(s);
        pushBottom(s,top);
    }
    public static void print(Stack<Integer> s){
        while(!s.isEmpty()){
            System.out.println(s.pop());
        }
    }
    public static void main(String[] args) {
        Stack<Integer> s=new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        //3,2,1
        reverse(s);
        print(s);
        }
    }

