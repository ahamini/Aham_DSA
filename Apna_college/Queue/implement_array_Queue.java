package Apna_college.Queue;
import java.util.*;
public class implement_array_Queue {
    static class queue {
        static int arr[];
        static int size;
        static int rear;

        public queue(int n) {
            arr = new int[n];
            size = n;
            rear = -1;
        }

        public static boolean isEmpty() {
            return rear == -1;
        }

        public static void add(int data) {
            if (rear == size - 1) {
                System.out.println("Queue is Full");
                return;
            }
            rear = rear + 1;
            arr[rear] = data;
        }

        public static void remove() {
            if (rear == -1) {
                System.out.println("Queue is Empty");
                return;
            }
            for (int i = 0; i < rear; i++) {
                arr[i] = arr[i + 1];
            }
            rear = rear - 1;
        }

        public static int peek() {
            return arr[0];
        }
        public static void print(){
            for(int i=0;i<=rear;i++){
                System.out.print(arr[i]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        queue qs=new queue(5);
        queue.add(1);
        queue.add(2);
        queue.add(4);
        queue.add(3);
        queue.print();
        queue.remove();
queue.remove();
queue.print();
    }
}
