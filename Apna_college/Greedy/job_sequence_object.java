package Apna_college.Greedy;
import java.util.*;
public class job_sequence_object {
    static class job{
        int id;
        int dedeline;
        int profit;
        public job(int i,int d,int p){
            id=i;
            dedeline=d;
            profit=p;
        }
    }
    public static void main(String args[]) {
            int jobsInfo[][]={{4,20},{1,10},{1,40},{1,30}};
            ArrayList<job> jb=new ArrayList<>();
            for(int i=0;i<jobsInfo.length;i++){
                jb.add(new job(i,jobsInfo[i][0],jobsInfo[i][1]));
            }
            Collections.sort(jb,(obj1,obj2)->obj2.profit-obj1.profit);//desecding
        int time=0;
        int value=0;
        ArrayList<Integer> ls=new ArrayList<>();
        for(int i=0;i<jb.size();i++){
            job curr=jb.get(i);
            if(curr.dedeline>time){
                ls.add(curr.id);
                value=value+curr.profit;
                time++;
            }
        }
        System.out.println("the total profit is : "+value);
        System.out.println("total time taken = "+time);
        System.out.println(ls);
    }
}
