package Apna_college.String;
import java.util.*;
public class print_largt_string {
    public static void main(String[] args) {
        String arr[]={"Apple","Banana","Arapes"};
        String largest=arr[0];
        for(int i=1;i<arr.length;i++){
            if(largest.compareToIgnoreCase(arr[i])<0)
                largest=arr[i];
        }
        System.out.println(largest);
    }
}
