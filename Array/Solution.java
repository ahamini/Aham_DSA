package Array;
import java.util.*;
import java.lang.Math;
public class Solution {
    public static long countMoves(long A,int B){
        long sumA = sum(A);
        long count = 0;
        while (sumA>B) {
            A++;
            sumA = sum(A);
            count++;
        }
        return count;
    }
    public static int sum(long n){
        int sum1=0;
        while(n!=0){
            int a=(int)n%10;
            sum1=sum1+a;
            n=n/10;
        }
        return sum1;
    }

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        long A=Integer.parseInt(scan.nextLine().trim());
        int B=Integer.parseInt(scan.nextLine().trim());
        long result=countMoves(A,B);
        System.out.println(result);
    }
    }
