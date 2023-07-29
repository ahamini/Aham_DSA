package Apna_college.Recursion;
import java.util.*;
public class tower_of_hanoi {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        hanoi(N,"A","B","C");
    }
    public static void hanoi(int N,String src,String helper,String dest){
        if(N==1) {
            System.out.println("Transfer disk " + N + " from " + src + " to "+dest);
            return;
        }
        //Tranfer n-1 disks from src to helper using helper
         hanoi(N-1,src,dest,helper);
        System.out.println("Transfer disk " + N + " from " + src + " to "+helper);
        //transfer n-1 disks from helper to destination
        hanoi(N-1,helper,src,dest);


    }
}
