//Program to build a Calculator using Switch
package Apna_college;
import java.util.*;
public class Calculator {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
        System.out.println("Enter the numbers a and b and operation");
        int a=sc.nextInt();
        int b=sc.nextInt();
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
                System.out.println("enter the corrct operation");
        }
        }
}
