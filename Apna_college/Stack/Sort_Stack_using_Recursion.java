package Apna_college.Stack;
import java.util.*;
public class Sort_Stack_using_Recursion {
    public void sort(Stack<Integer> s) {
        if (!s.isEmpty()) {
            int x = s.pop();
            sort(s);
            insert(s, x);
        }
    }
    public void insert(Stack<Integer> s,int x){

    }
}
