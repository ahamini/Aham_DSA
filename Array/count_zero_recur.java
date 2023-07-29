package Array;

public class count_zero_recur {
    public static void main(String[] args) {
        int num=count(10020030);
        System.out.println(num);
    }
    static int count(int n){
        if(n==0)
            return 0;
        else{
            if(n%10==0)
                return 1+count(n/10);
            else
                return count(n/10);
        }
    }
}
