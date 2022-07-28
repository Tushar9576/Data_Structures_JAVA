import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class cycledetectionindirected2 {
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
        int count = 0;
        while(q.isEmpty() == false){
            int u = q.poll();
            // System.out.print(u + " ");
            for(int x : adj.get(u))
                if(--indegree[x] == 0)
                    q.add(x);
            count++ ;
        }
        if(count != v)
            System.out.println("Cycle is present");
        else
            System.out.println("Cycle is not present");
    }
    static void addEdge(ArrayList<ArrayList<Integer>> adj, int u, int v){
        adj.get(u).add(v);
    }
    public static void main(String[] args) {
        int V = 6;
        ArrayList<ArrayList<Integer>> adj = new ArrayList<ArrayList<Integer>>(V);
        for (int i = 0; i < V; i++)
            adj.add(new ArrayList<Integer>(V));

        addEdge(adj,0,1);
        addEdge(adj,2,1);
        addEdge(adj,2,3);
        addEdge(adj,3,4);
        addEdge(adj,4,5);
        addEdge(adj,5,3);
        topologicalsort(adj,V);

    }
}
