package Array;
import java.util.*;
public class hfpyramid_num {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the height");
        int n=sc.nextInt();
        int ctr=1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print((ctr++) +" ");
            }
            System.out.println();
        }
    }
}
