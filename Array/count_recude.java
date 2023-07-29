package Array;

public class count_recude {
    public static void main(String[] args) {
      int x=  count(14,0);
        System.out.println(x);
    }
    static int count(int n,int x){
        if(n==0)
            return x;
        else{
            if(n%2==0)
                return count(n/2,x+1);
            else
                return count(n-1,x+1 );

        }
    }
}
