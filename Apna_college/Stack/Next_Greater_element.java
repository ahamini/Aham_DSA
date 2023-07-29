package Apna_college.Stack;
import java.util.*;
public class Next_Greater_element {
     //Next Greater right
     public static void main(String[] args){
          int arr[]={3,5,4,7,0,6};
          int nextGreater[]=new int[arr.length];
          Stack<Integer> s=new Stack<>();
          for(int i=arr.length-1;i>=0;i--){
               while(!s.isEmpty() && arr[s.peek()]<=arr[i])
                    s.pop();
               if(s.isEmpty())
                    nextGreater[i]=-1;
               else
                    nextGreater[i]=arr[s.peek()];
               s.push(i);
          }
          for(int i=0;i<nextGreater.length;i++){
               System.out.print(nextGreater[i]+" ");
          }
     }
     //Next Greater left-"reverse the for loop".
     //Next Smallest Right-"Change arr[peek()]<=arr[i] to arr[peek()]>=arr[i]".
     //Next Smallest Left-"done Above both Steps".
}
