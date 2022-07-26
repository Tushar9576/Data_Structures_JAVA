
// Count connected components in an undirected graph also known as Number of Islands in the graph
// Popular Interview Question

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class countconnected {
    static void bfs(ArrayList<ArrayList<Integer>> adj, int s, boolean[] visited){
        Queue<Integer> q = new LinkedList<Integer>();
        visited[s] = true;
        q.add(s);
        while(q.isEmpty() == false){
            int u = q.poll();
            //System.out.print(u + " ");
            for (int v : adj.get(u)) {
                if(visited[v] ==  false){
                    visited[v] = true;
                    q.add(v);
                }
            }
        }
    }
    static int bfsdis(ArrayList<ArrayList<Integer>> adj, int v){
        int count = 0;
        boolean[] visited = new boolean[v + 1];
        for (int i = 0; i < v; i++) {
            if(visited[i] == false){
                bfs(adj, i, visited);
                count++;
            }
        }
        return count;
    }
    static void addEdge(ArrayList<ArrayList<Integer>> adj, int u, int v){
        adj.get(u).add(v);
        adj.get(v).add(u);
    }

    public static void main(String[] args) {
        int v = 7;
        boolean[] visited = new boolean[v];

        ArrayList<ArrayList<Integer>> adj = new ArrayList<ArrayList<Integer>>(v);
        for (int i = 0; i < v; i++) {
            adj.add(new ArrayList<Integer>());
        }
        addEdge(adj,0,1);
        addEdge(adj,0,2);
        addEdge(adj,2,3);
        addEdge(adj,1,3);
        addEdge(adj,4,5);
        addEdge(adj,5,6);

        System.out.println(bfsdis(adj,v));
    }
}
