package Apna_college;
import java.util.*;
public class patrern_181 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Height");
        int n=sc.nextInt();
        for(int i=n;i>=1;i--){
            for(int j=1;j<=n;j++){
                if(j<i)
                    System.out.print(" ");
                else
                    System.out.print("*");
            }
            System.out.println();
        }
    }
}
