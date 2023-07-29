package Array;

import java.util.Scanner;

public class tax_calculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your Salary");
        int n=sc.nextInt();
        float tax=0f;
        if(n<=500000)
            System.out.println("Tax: "+tax);
        else if(n>500000 && n<=1000000)
            System.out.println("Tax: "+(20f/100*n));
        else
            System.out.println("Tax: "+(30f/100*n));
    }
}
