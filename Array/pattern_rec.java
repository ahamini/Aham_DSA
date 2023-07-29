package Array;
import java.util.*;
public class pattern_rec {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the lenght and bredth 3 or more ");
        int a=sc.nextInt();
        for(int i=1;i<=a;i++){
            if(i==1||i==a) {
                for (int j = 1; j <=a; j++) {
                    System.out.print("*");
                }
            }
            else {
                for (int j = 1; j <=a; j++) {
                    if (j == 1 || j ==a)
                        System.out.print("*");
                    else
                        System.out.print(" ");
                }
            }
            System.out.println();
            }
        }
    }

