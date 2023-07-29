package Apna_college.Queue;
import java.util.*;
public class queueUsing2stacks {
        static class queue{
            static Stack<Integer> s1=new Stack<>();
            static Stack<Integer> s2=new Stack<>();
            public static boolean isEmpty(){
                return s1.isEmpty();
            }
            public static void add(int data){
                while(!s1.isEmpty()){
                    s2.push(s1.pop());
                }
                s1.push(data);
                while(!s2.isEmpty()){
                    s1.push(s2.pop());
                }
            }
            public static int remove(){
                if(isEmpty()){
                    System.out.println("Queue is Empty");
                    return -1;
                }
                return s1.pop();
            }
            public static int peek(){
                if(isEmpty()){
                    System.out.println("Queue is Empty");
                    return -1;
                }
                return s1.peek();
            }
        }
        public static void main(){
            queue Qs=new queue();
            queue.add(1);
            queue.add(2);
            queue.add(3);
            while(!queue.isEmpty()){
                System.out.println(queue.peek());
                queue.remove();
            }
        }
    }

