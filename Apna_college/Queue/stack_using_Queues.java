package Apna_college.Queue;
import java.util.*;
public class stack_using_Queues {
    static class stack{
      static  Queue<Integer> q1=new LinkedList<>();
        static Queue<Integer> q2=new LinkedList<>();
        public static boolean isEmpty(){

            return q1.isEmpty() && q2.isEmpty();
        }
        public static void add(int data){
            if(!q1.isEmpty()){
                q1.add(data);
            }
            else
                q2.add(data);
        }
        public static int remove(){
            if(q1.isEmpty()) {
                while (!q2.isEmpty()) {
                    q1.add(q2.remove());
                }
                return q1.remove();
            }
            else{
                while(!q1.isEmpty()){
                    q2.add(q1.remove());
            }
               return q2.remove();
        }
    }
    public static int peek(){
        if(q1.isEmpty()) {
            while (!q2.isEmpty()) {
                q1.add(q2.remove());
            }
            return q1.peek();
        }
        else{
            while(!q1.isEmpty()){
                q2.add(q1.remove());
            }
            return q2.peek();
        }
        }

        public static void main(String[] args) {
        }
    }
}
