package Apna_college.Graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BFS {
    static class Edge{
        int src;
        int dst;
        int weight;

        public Edge(int src,int dst,int weight){
            this.src=src;
            this.dst=dst;
            this.weight=weight;
        }
    }
    public static void bfs(ArrayList<Edge>[] graph){//O(V+E)
        Queue<Integer> q=new LinkedList<>();
        boolean vis[]=new boolean[graph.length];

        q.add(0);

        while(!q.isEmpty()){
            int curr=q.remove();

            if(!vis[curr]){
            vis[curr]=true;
            System.out.print(curr+"   ");
            for(int i=0;i<graph[curr].size();i++){
                Edge e=graph[curr].get(i);
                q.add(e.dst);
               }
            }
        }
    }
    public static void main(String[] args) {
        int V=5;
        ArrayList<Edge>[] graph=new ArrayList[V];
        for(int i=0;i<graph.length;i++){
            graph[i]=new ArrayList<>();
        }
        // 0 vertex
        graph[0].add(new Edge(0,1,5));

        // 1 vertex
        graph[1].add(new Edge(1,0,5));
        graph[1].add(new Edge(1,2,1));
        graph[1].add(new Edge(1,3,3));

        // 2 vertex
        graph[2].add(new Edge(2,1,1));
        graph[2].add(new Edge(2,3,1));
        graph[2 ].add(new Edge(2,4,2));

        // 3 vertex
        graph[3].add(new Edge(3,1,3));
        graph[3].add(new Edge(3,2,1));

        // 4 vertex

        graph[4].add(new Edge(4,2,2));

        bfs(graph);

    }
}
