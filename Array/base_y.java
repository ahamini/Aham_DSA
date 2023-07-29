package Array;
import java.util.*;
public class base_y {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int base=sc.nextInt();
        int count=0;
        for(int i=0;i<=n;i++){
            while(i!=0){
                count++;
                i=i/base;
            }
        }
        System.out.println(count);
    }
}
