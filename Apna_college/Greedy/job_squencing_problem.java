package Apna_college.Greedy;
import java.util.*;
public class job_squencing_problem {
    public static void main(String[] args) {
        int [][] jobs={{4,20},{1,10},{1,40},{1,30}};
        Arrays.sort(jobs,Comparator.comparing(o->o[1]));
        int time=0;
        int value=0;
        for(int i=jobs.length-1;i>=0;i--){
            if(jobs[i][0]>time){
                value=value+jobs[i][1];
                System.out.println(value);
                time++;
            }
        }
        System.out.println("the max value is "+value);
    }
}
