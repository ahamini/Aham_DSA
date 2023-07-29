package Apna_college.Heaps;
import java.util.*;
public class Compare_objects {
    static class Student implements Comparable<Student>{
        String name;
        int rank;
        public Student(String name,int rank){
            this.name=name;
            this.rank=rank;
        }
        @Override
        public int compareTo(Student s2){
            return this.rank- s2.rank;
        }
    }

    public static void main(String[] args) {
        PriorityQueue<Student> pq=new PriorityQueue<>(Comparator.reverseOrder());
        pq.add(new Student("Aham",20));
        pq.add(new Student("Anshved",22));
        pq.add(new Student("Hemant",07));
        pq.add(new Student("Zeeshan",12));
        while(!pq.isEmpty()){
            System.out.println(pq.peek().name +"-->"+pq.peek().rank);
            pq.remove();
        }
    }
}
