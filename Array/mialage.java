package Array;
import java.util.*;
public class mialage {

        public static void main (String[] args) throws java.lang.Exception
        {
            // your code goes here
            Scanner sc=new Scanner(System.in);
            int T=sc.nextInt();
            while(T -->0){
                int N=sc.nextInt();
                int X=sc.nextInt();
                int Y=sc.nextInt();
                int A=sc.nextInt();
                int B=sc.nextInt();
                float petA=N/(float)A*X;
                float petB=N/(float)B*Y;
                System.out.println(petA);
                System.out.println(petB);
                if(petA==petB)
                    System.out.println("ANY");
                else if(petA>petB)
                    System.out.println("DIESEL");
                else
                    System.out.println("PETROL");
            }
        }
    }


