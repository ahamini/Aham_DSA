package Array;

import java.util.Scanner;

public class binary_patter {
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("enter the height");
            int n=sc.nextInt();
            int ctr=1;
            for(int i=1;i<=n;i++){
                if(i%2!=0)
                ctr=1;
                else
                    ctr=0;
                for(int j=1;j<=i;j++){
                    System.out.print((ctr) +" ");
                    if(ctr==1)
                        ctr=0;
                    else
                        ctr=1;
                }
                System.out.println();
            }
        }
    }

