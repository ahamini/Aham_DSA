package Array;

public class reverse_recur1 {
    public static void main(String[] args) {
        int x = reverse(12345,10000);

        System.out.println(x);
    }

    static int reverse(int n,int hel) {
        if (n == 0)
            return 0;
        else {
            return (n%10)*hel+reverse(n/10,hel/10);
        }
    }

}
