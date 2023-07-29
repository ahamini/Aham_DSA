package Apna_college.Graph;
import java.io.UncheckedIOException;
import java.util.*;
public class DFS {
    static class Edge{
        int src;
        int dst;
        int wgt;

        public Edge(int src,int dst, int wgt){
            this.src=src;
            this.dst=dst;
            this.wgt=wgt;
        }
    }

    public static void dfs(ArrayList<Edge>[] graph,int curr, boolean[] vis){ //(V+E)
        System.out.print(curr+"  ");
        vis[curr]=true;

        for(int i=0;i<graph[curr].size();i++){
            Edge e=graph[curr].get(i);
            if(!vis[e.dst]){
                dfs(graph,e.dst,vis);
            }
        }
    }
@SuppressWarnings("unchecked")
    public static void main(String[] args) {
        int V=7;
        ArrayList<Edge>[] graph=new ArrayList[V];
        for(int i=0;i<graph.length;i++){
            graph[i]=new ArrayList<>();
        }
        //0- vertex
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
        dfs(graph,0,vis);
    }
}
