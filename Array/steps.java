package Array;
import java.util.*;
 class steps {
    public static void main(String[] args) {
         try{
        Scanner sc = new Scanner(System.in);
        long A = sc.nextLong();
        int B = sc.nextInt();
        int sumA = sum(A);
        int count = 0;
        while (sumA>B) {
            A++;
            sumA = sum(A);
            count++;
        }
        System.out.println(count);
    }
    catch (Exception e) {
        return;
    }
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
}
