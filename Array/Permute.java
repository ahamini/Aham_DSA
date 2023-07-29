package Array;
import java.util.*;
public class Permute {
    public static int permutation(int n,int cur){
        if(cur==n) {
            print(n);
            return 0;
        }
        else{
return 0;        }

    }
    static void print(int n) {

        for (int i = 0; i <n; i++) {
            System.out.print(i+ " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        permutation(n,0);
    }
}
