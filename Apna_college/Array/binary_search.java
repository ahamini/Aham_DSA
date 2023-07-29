package Apna_college.Array;
import java.util.*;
public class binary_search {
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
            int key=sc.nextInt();
            int arr[]=new int[n];
            for(int i=0;i<n;i++)
                arr[i]=sc.nextInt();
            int index=binary(0,key,arr,arr.length);
            if(index==-1)
                System.out.println("Element not found");
            else
                System.out.println("Element found at position :"+(index+1));
        }
        static int binary(int low,int key,int arr[],int high){
            int index =-1;
            while(low<high) {
                int mid = (low + high) / 2;
                if (arr[mid] == key){
                    index = mid;
                break;
            }
                else if (arr[mid] < key)
                    low = mid + 1;
                else
                    high = mid - 1;
            }
            return index;
        }
    }

