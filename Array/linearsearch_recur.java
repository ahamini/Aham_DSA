package Array;

import java.util.ArrayList;

public class linearsearch_recur {
    public static void main(String[] args) {
        int arr[]={3,5,565,3,45,6,21};
        ArrayList<Integer> ls=new ArrayList<>();
        System.out.println(iscontain(arr,21,0));//return true or false
        System.out.println(isContain(arr,5,0)); //cannot takes list as an Argument
        System.out.println(Iscontain(arr,6,0,ls));// take list as an Argument
    }
    public static boolean iscontain(int arr[],int temp,int index){
        if(index==arr.length-1)
           if(arr[index]==temp)
            return true;
           else
               return false;
        else{
            return arr[index]==temp || iscontain(arr,temp,index+1);
        }
    }
    public static ArrayList<Integer> Iscontain(int arr[],int temp,int index,ArrayList<Integer> list) {
        if(index==arr.length)
            return list;
        if(arr[index]==temp)
            list.add(index);
           return Iscontain(arr,temp,index+1,list);
    }
    public static ArrayList<Integer> isContain(int arr[],int temp,int index){
        ArrayList<Integer> list=new ArrayList<>();
        if(index==arr.length)
            return list;
        if(arr[index]==temp)
            list.add(index);
        ArrayList<Integer> allbelowcall=isContain(arr,temp,index+1);
        list.addAll(allbelowcall);
        return list;
    }
}
