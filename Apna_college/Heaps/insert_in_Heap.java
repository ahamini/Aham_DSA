package Apna_college.Heaps;
import java.util.*;
public class insert_in_Heap {
        static class heap{
            ArrayList<Integer> ls=new ArrayList<>();
            public void add(int data){ //O(logn)
                ls.add(data);
                // fix heap
               int x=ls.size()-1;
                while(ls.get(x)<ls.get((x-1)/2)){
                    int temp=ls.get(x);
                    ls.set(x,ls.get((x-1)/2));
                    ls.set(((x-1)/2),temp);
                    x=((x-1)/2);
                }
            }
            public void print(){
                System.out.println(ls);
            }
        }

    public static void main(String[] args) {
        heap ob=new heap();
        ob.add(2);
        ob.add(3);
        ob.add(4);
        ob.add(5);
        ob.add(6);
        ob.add(1);
        ob.print();
    }
}
