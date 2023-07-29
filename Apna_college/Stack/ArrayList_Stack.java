package Apna_college.Stack;
import java.util.*;
public class ArrayList_Stack {
     static class stack{
        static ArrayList<Integer> ls=new ArrayList<>();
        public boolean isEmpty(){
            return ls.size()==0;
        }
        public void push(int data){
            ls.add(data);
        }
        public int pop(){
            int val=ls.get(ls.size()-1);
            ls.remove(ls.size()-1);
            return val;
        }
        public int peek(){
            return ls.get(ls.size()-1);
        }
    }

    public static void main(String[] args) {
        stack s=new stack();
        s.push(3);
        s.push(2);
        s.push(1);
        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }
    }
}
