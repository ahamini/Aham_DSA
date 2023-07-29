package Apna_college.Heaps;
import java.util.*;
public class delete_from_heap {
      static class heap {
          ArrayList<Integer> ls = new ArrayList<>();

          void add(int num) {
              ls.add(num);
              int x = ls.size() - 1;
              while (ls.get(x) < ls.get((x - 1) / 2)) {
                  int temp = ls.get(x);
                  ls.set(x, ls.get((x - 1) / 2));
                  ls.set((x - 1) / 2, temp);
                  x = (x - 1) / 2;
              }
          }

          private void hepify(int i) {
              int left = 2 * i + 1;
              int right = 2 * i + 2;
              int minIdx = i;
              if (left < ls.size() && ls.get(minIdx) > ls.get(left)) {
                  minIdx = left;
              }
              if (right < ls.size() && ls.get(minIdx) > ls.get(right)) {
                  minIdx = right;
              }
              if (minIdx != i) {
                  int temp = ls.get(i);
                  ls.set(i, ls.get(minIdx));
                  ls.set(minIdx, temp);
                  hepify(minIdx);
              }
          }

          public int remove() {
              int data = ls.get(0);
              //swap first and last element
              int temp = ls.get(0);
              ls.set(0, ls.get(ls.size() - 1));
              ls.set(ls.size() - 1, temp);

              //remove last element
              ls.remove(ls.size() - 1);

              //hepify
              hepify(0);
              return data;
          }

          boolean isEmpty() {
              return ls.size() == 0;
          }
      }
    public static void main(String[] args) {
        heap pq=new heap();
        pq.add(3);
        pq.add(4);
        pq.add(1);
        pq.add(5);

        while(!pq.isEmpty()){
            System.out.println(pq.remove());
        }
    }
}
