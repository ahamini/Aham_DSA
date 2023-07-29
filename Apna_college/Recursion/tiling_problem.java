package Apna_college.Recursion;
import java.util.*;
public class tiling_problem {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println("The no of ways :"+ tile_floor(n));
    }
    static int tile_floor(int n){
        if(n==0 ||n==1)
            return 1;
        //vertical
        int way1=tile_floor(n-1);
        //horozontal
        int way2=tile_floor(n-2);
        int result=way1+way2;
        return result;
    }
}
