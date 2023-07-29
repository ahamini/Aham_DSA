package Apna_college.Hashing;
import java.sql.SQLOutput;
import java.util.*;
public class HashMap_Implementation {
     static class HashMap<K,V>{
         private class Node{
             K key;
             V value;

             public  Node(K key,V value){
                 this.key=key;
                 this.value=value;
             }
         }
         private int n; //n
         private int N;
         private LinkedList<Node> buckets[]; //N


      @SuppressWarnings("unchecked")
         public HashMap(){
             this.n=0;
             this.N=4;
             this.buckets=new LinkedList[N];
             for(int i=0;i<4;i++){
                 buckets[i]=new LinkedList<>();
             }
         }

         public int hashFunc(K key){
          int hc=key.hashCode();
          return Math.abs(hc)% N;
         }

         public int searchInLL(K key, int bi){
             LinkedList<Node> ll=buckets[bi];
             int di=0;
             for(int i=0;i<ll.size();i++){
                 if(ll.get(i).key==key) {
                     return di;
                 }
                 di++;
             }
             return -1;
         }
         @SuppressWarnings("unchecked")
         private void reHashing(){ // O(n)
          LinkedList<Node> oldBucket[]=buckets;
          LinkedList<Node>[] buckets=new LinkedList[N*2];
          N=N*2;
          for(int i=0;i< buckets.length;i++){
              buckets[i]=new LinkedList<>();
          }
          for(int i=0;i< oldBucket.length;i++){
              LinkedList<Node> ll=oldBucket[i];
              for(int j=0;j<ll.size();j++){
                  Node node=ll.remove();
                  put(node.key, node.value);
              }
          }
         }
         public void put(K key,V value){  // O(lamda) -> O(1)
             int bi=hashFunc(key);
             int di=searchInLL(key,bi);

             if(di!=-1){
                 Node node=buckets[bi].get(di);
                 node.value=value;
             }
             else{
                 buckets[bi].add(new Node(key,value));
                 n++;
             }
             double lamda=(double)n/N;
             if(lamda>2.0)
                 reHashing();
         }

         public boolean containsKey(K key){ // O(1)
             int bi=hashFunc(key);
             int di=searchInLL(key,bi);

             if(di!=-1){
                 return true;
             }
             else{
                return false;
             }
         }

         public V get(K key){ // O(1)
             int bi=hashFunc(key);
             int di=searchInLL(key,bi);

             if(di!=-1){
                 Node node=buckets[bi].get(di);
                 return node.value;
             }
             else{
                 return null;
             }
         }

         public V remove(K key){ // O(1)
             int bi=hashFunc(key);
             int di=searchInLL(key,bi);

             if(di!=-1){
                 Node node=buckets[bi].remove(di);
                 n--;
               return  node.value;
             }
             else{
                 return null;}
         }

         public ArrayList<K> ketSet(){
          ArrayList<K> keys=new ArrayList<>();
          for(int i=0;i< buckets.length;i++){
              LinkedList<Node> ll=buckets[i];

              for(Node node: ll){
                  keys.add(node.key);
              }
          }
          return keys;
         }
     } //K,V are the Generics whose datatype not defined
    public static void main(String[] args) {
          HashMap<String,Integer> hm=new HashMap<>();
          hm.put("India",100);
          hm.put("China",200);
          hm.put("Nepal",10);
        System.out.println( hm.containsKey("India"));
        System.out.println(hm.containsKey("Bhutan"));

        System.out.println(hm.get("China"));

        System.out.println(hm.ketSet());
    }
}
