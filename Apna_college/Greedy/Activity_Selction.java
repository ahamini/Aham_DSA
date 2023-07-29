package Apna_college.Greedy;
import java.util.*;
public class Activity_Selction {
    public static void main(String[] args) {
        int start[]={5,3,5,1,2,0,8};
        int end[]={9,4,7,2,12,6,9};
        int maxAct=1;
        int arr[][]=new int[start.length][3];
        for(int i=0;i<arr.length;i++){
            arr[i][0]=i;
            arr[i][1]=start[i];
            arr[i][2]=end[i];
        }
        Arrays.sort(arr,Comparator.comparing(o ->o[2]));
        ArrayList<Integer> ls=new ArrayList<>();
        ls.add(arr[0][0]);
        int lastEnd=arr[0][2];
        for(int i=1;i<start.length;i++){
            if(arr[i][1]>=lastEnd){
                maxAct++;
                ls.add(i);
                lastEnd=arr[i][2];
            }
        }
        System.out.println("No of Activities are: "+maxAct);
        System.out.println(ls);
    }
}
