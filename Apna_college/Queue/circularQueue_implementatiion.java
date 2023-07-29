package Apna_college.Queue;
import java.util.*;
public class circularQueue_implementatiion {
    public static class queue{
        static int arr[];
        static int size;
        static int rear;
        static int front;
        public queue(int n){
            arr=new int[n];
            size=n;
            rear=-1;
            front=-1;
        }
    public static boolean isEmpty(){
        return rear==-1 && front==-1;
        }

        public static boolean isFull(){
            return front==(rear+1)%size;
        }
        public static void add(int data){
            if(isFull()){
                System.out.println("Queue is full");
                return;
            }
            if(front==-1){
                front=0;
            }
            rear=(rear+1)%size;
            arr[rear]=data;
        }
        public static void remove(){
            if(isEmpty()){
                System.out.println("Queue is Full");
                return;
            }
            if(front==rear)
                front=rear=-1;
            else
            front=(front+1)%size;
        }
        public static int  peek(){
            return arr[front];
        }
        public static void print(){
            if(isEmpty()){
                System.out.println("Queue is Empty");
                return;
            }
            while(!isEmpty()){
                System.out.print(peek());
                remove();
            }
        }

        public static void main(String[] args) {
            queue qs=new queue(3);
            queue.add(1);
            queue.add(2);
            queue.add(3);
            queue.print();
            queue.add(4);
            queue.add(5);
            queue.print();
        }
    }
}
