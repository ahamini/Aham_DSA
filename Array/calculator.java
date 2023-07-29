package Array;

import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the valus of a and b:");
        int a=sc.nextInt();
        int b= sc.nextInt();
        System.out.println("Enter your operation to perform");
        String ch=sc.next();
        switch (ch){
            case "+":
                System.out.println(a+b);
                break;
            case "-":
                System.out.println(a-b);
                break;
            case "*":
                System.out.println(a*b);
                break;
            case "/":
                System.out.println(a/b);
                break;
            default:
                System.out.println("Please enter a vaid operation");
        }
    }
}
