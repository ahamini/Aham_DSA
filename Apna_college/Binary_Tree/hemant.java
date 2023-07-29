package Apna_college.Binary_Tree;
import java.util.*;
public class hemant {
    public static void main(String[] args) {
        long a=4,b=4,c=4;
        long count=0;
        long arr[]=new long[3];
        arr[0]=a;
        arr[1]=b;
        arr[2]=c;
        Arrays.sort(arr);
        count=arr[0]*(arr[1]-1)*(arr[2]-2);
        System.out.println(count);
    }
}
