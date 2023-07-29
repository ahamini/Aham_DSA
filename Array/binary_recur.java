package Array;

public class binary_recur {
    public static boolean iscontain(int arr[],int low,int high,int temp){
        if(low>high)
            return false;
        int mid=(low+high)/2;
        if(arr[mid]==temp)
            return true;
        else if(arr[mid]>temp)
            return iscontain(arr,low,mid-1,temp);
        else
            return iscontain(arr,mid+1,high,temp);
        }


    public static void main(String[] args) {
        int arr[]={3,5,8,12,34,56};
        System.out.println(iscontain(arr,0,arr.length-1,11));
    }
}
