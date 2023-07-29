package Apna_college.Recursion;
import java.util.*;
public class pattern {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            if(i==1) {
                for (int j = 1; j <= n - 1; j++)
                    System.out.print(0);
                System.out.print("*");
                for (int j = 1; j <= n - 1; j++)
                    System.out.print(0);
            }
            else{
                for (int j = 1; j <= n ; j++) {
                    if (j == i)
                        System.out.print("*");
                    else
                        System.out.print(0);
                }
                System.out.print("*");
                for (int j = 4; j >=1 ; j--){
                    if (j == i)
                        System.out.print("*");
                    else
                        System.out.print(0);
                }

            }
            System.out.println();
        }
    }
}
