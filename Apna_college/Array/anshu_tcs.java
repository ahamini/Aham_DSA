package Apna_college.Array;
import java.util.Scanner;
 class program3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum = 0;
        while(num > 0)
        {
           int a = num % 10;
            num = num / 10;
            sum = sum + a;
        }
        System.out.println("the sum of Didgits of a number is "+sum);
    }
}
