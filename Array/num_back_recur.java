package Array;

public class num_back_recur {
    public static void main(String[] args) {
        num_back_recur ob=new num_back_recur();
        ob.print(5);
    }
    void print(int n){
        if(n==0)
            return;
        else{
            print(n-1);
            System.out.println(n);
        }
    }
}
