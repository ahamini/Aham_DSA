package Array;
import java.util.*;
public class MyClass {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        ArrayList<Integer> ls=new ArrayList<>();
        for(int i=0;i<N;i++){
            ls.add(sc.nextInt());
        }
        int max=0;
        Collections.sort(ls,Collections.reverseOrder());
        System.out.println(ls);
        for(int i=0;i<ls.size();){
            for(int j=0;j<ls.size();j++) {
                if (ls.get(i) >= ls.get(j) * 2) {
                    System.out.println(ls.get(i));
                    ls.remove(i);
                }
            }
                if(ls.size()==1)
                    break;
            }
        System.out.println(ls.size());
    }
}
