package Array;

public class number_recur {
    public static void main(String[] args) {
       number_recur ob=new number_recur();
       ob.print_num1(5);
    }
    void print_num1(int n){
        if(n==0)
            return;
        else{
            System.out.println(n);
            print_num1(n-1);
        }
    }
}
