package Array;

public class product_of_n {
    public static void main(String[] args) {
      int x= print_product(54321);
        System.out.println(x);
    }
//    static int print(int n){
//        if(n==1)
//            return 1;
//        else {
//            return n*print(n-1);
//        }
        static int print_product(int n){
            if(n==0)
                return 1;
            else {
                return n%10*print_product(n/10);
            }
    }
}
