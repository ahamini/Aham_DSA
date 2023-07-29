package Apna_college.Graph;
import java.util.*;
public class Has_Path {
    static class Edge{
        int src,dst,wgt;
        public Edge(int src,int dst,int wgt){
            this.src=src;
            this.dst=dst;
            this.wgt=wgt;
        }
    }
    public static boolean hasPath(ArrayList<Edge> [] graph,boolean[] vis,int src,int dst){
        if(src==dst)
            return true;
        vis[src]=true;

        for(int i=0;i<graph[src].size();i++){
            Edge e=graph[src].get(i);

            if(!vis[e.dst] && hasPath(graph,vis,e.dst,dst)){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int V=7;
        ArrayList<Edge> [] graph=new ArrayList[V];
        for(int i=0;i< graph.length;i++){
            graph[i]=new ArrayList<>();
        }

        graph[0].add(new Edge(0,1,1));
        graph[0].add(new Edge(0,2,1));

        // 1-vertex
        graph[1].add(new Edge(1,0,1));
        graph[1].add(new Edge(1,3,1));

        //2- vertex
        graph[2].add(new Edge(2,0,1));
        graph[2].add(new Edge(2,4,1));

        //3- vertex
        graph[3].add(new Edge(3,1,1));
        graph[3].add(new Edge(3,4,1));
        graph[3].add(new Edge(3,5,1));

        //4- vertex
        graph[4].add(new Edge(4,2,1));
        graph[4].add(new Edge(4,3,1));
        graph[4].add(new Edge(4,5,1));

        //5- vertex
        graph[5].add(new Edge(5,3,1));
        graph[5].add(new Edge(5,4,1));
        graph[5].add(new Edge(5,6,1));

        //6- vertex
        graph[6].add(new Edge(6,5,1));

        boolean[] vis=new boolean[V];
        System.out.println(hasPath(graph,vis,0,5 ));
    }
}
