package Array;

public class isSorted_recur {
    static int x=0;
    public static boolean array_sorted(int arr[],int n){
        if(n<=1) {
            if (x == arr.length - 1)
                return true;
            else
                return false;
        }
        else{
            if(arr[n-1]>arr[n-2])
                ++x;
                return array_sorted(arr,n-1);
        }
    }

    public static void main(String[] args) {
        int arr[]={2,43,6,70,34};
        System.out.println(array_sorted(arr,arr.length));
    }
}
