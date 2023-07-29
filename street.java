import java.util.Scanner;

public class street {
       static  int street_plan(int num){
           int arr1[]=new int[100];
           int arr2[]=new int [100];
           arr1[0]=arr2[0]=0;
           arr1[1]=arr1[2]=arr2[1]=1;
           arr2[2]=2;
           for(int i=3;i<=num;i++) {
               arr1[i] += arr2[i - 1];
               arr2[i] += arr1[i - 1] + arr2[i - 1];
           }
           int result=arr1[num]+arr2[num];
           return result*result;
        }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(street_plan(n));
    }
         }
