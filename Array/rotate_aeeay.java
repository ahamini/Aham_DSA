package Array;
import java.util.*;
public class rotate_aeeay {
    public static boolean isrepeat(int arr[]){
        HashSet<Integer> hst=new HashSet<>();
        for(int i=0;i<arr.length;i++){
            if(hst.contains(arr[i]))
                return true;
            else
                hst.add(arr[i]);
        }
        return false;
    }

    public static void main(String[] args) {
        int arr[]={1,1,45,4,3,87};
        System.out.println(isrepeat(arr));
    }
}
