import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

// This is topologicals sorting
// Based on Kahn's BFS based Algorithm
public class topologicalsort1 {
    static void topologicalsort(ArrayList<ArrayList<Integer>> adj, int v){
        int[] indegree  = new int[v];
        for (int u = 0; u < v; u++) {
            for(int x : adj.get(u))
                indegree[x]++;
        }
        Queue<Integer> q = new LinkedList<>();
        for (int i = 0; i < v; i++) {
            if(indegree[i] == 0)
                q.add(i);
        }
        while(q.isEmpty() == false){
            int u = q.poll();
            System.out.print(u + " ");
            for(int x : adj.get(u))
                if(--indegree[x] == 0)
                    q.add(x);
        }

    }
    static void addEdge(ArrayList<ArrayList<Integer>> adj, int u, int v){
        adj.get(u).add(v);

    }

    public static void main(String[] args) {
        int V = 5;
        ArrayList<ArrayList<Integer> > adj = new ArrayList<ArrayList<Integer>>(V);

        for (int i = 0; i < V; i++)
            adj.add(new ArrayList<Integer>());

        addEdge(adj,0, 2);
        addEdge(adj,0, 3);
        addEdge(adj,1, 3);
        addEdge(adj,1, 4);
        addEdge(adj,2, 3);
        topologicalsort(adj,V);

    }
}
