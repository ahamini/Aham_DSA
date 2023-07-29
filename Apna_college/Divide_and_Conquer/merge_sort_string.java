package Apna_college.Divide_and_Conquer;
import java.util.*;
public class merge_sort_string {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String arr[]={"anshved","hemant","zeeshan","aham"};
        merge_sort(arr,0,arr.length-1);
        for(int i=0;i<arr.length;i++)
            System.out.print(arr[i]+"  ");
    }
    public static void merge_sort(String arr[],int si,int ei){
        if(si>=ei){
            return;
        }
        int mid=(si+ei)/2;
        merge_sort(arr,0,mid);
        merge_sort(arr,mid+1,ei);
        merge(arr,si,mid,ei);
    }
    public static void merge(String arr[],int si,int mid,int ei){
        String temp[]=new String[ei-si+1];
        int n= temp.length;
        int i=si;
        int j=mid+1;
        int k=0;
        while(i<=mid && j<=ei){
            if(arr[i].compareTo(arr[j])<0){
                temp[k]=arr[i];
                i++;
            }
            else{
                temp[k]=arr[j];
                j++;
            }
            k++;
        }
        while(i<=mid)
            temp[k++]=arr[i++];
        while(j<=ei)
            temp[k++]=arr[j++];
        for(k=0,i=si;k<n;k++,i++){
            arr[i]=temp[k];
        }
    }
}
