package Apna_college.Stack;
import java.util.*;
public class reverse_String_stack {
    public static String reverse(String s){
        Stack<Character> st=new Stack<Character>();
        int i=0;
        while(i<s.length()){
            st.push(s.charAt(i));
            i++;
        }
        StringBuilder stb=new StringBuilder("");
        while(!st.isEmpty()){
            stb.append(st.pop());
        }
        return stb.toString();
    }

    public static void main(String[] args) {
        String s="abc";
        String result=reverse(s);
        System.out.println(result);
    }
}
