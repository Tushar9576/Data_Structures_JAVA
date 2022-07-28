import java.util.ArrayList;

// Detect the cycle in a directed Graph
// This solution uses DFS
// recst = recursion stack array

public class cycledetectionindirected1 {
    static boolean dfsrec(ArrayList<ArrayList<Integer>> adj, int s, boolean[] visited, boolean[] recst){
        visited[s] = true;
        recst[s] = true;
        for(int u : adj.get(s)){
            if(visited[u] == false && dfsrec(adj,u,visited,recst)){
                return true;
            } else if (recst[u] == true) {
                return true;
            }

        }
        recst[s] = false;
        return false;
    }
    static boolean dfs(ArrayList<ArrayList<Integer>> adj, int v){
        boolean[] visited = new boolean[v];
        boolean[] recst = new boolean[v];
        for (int i = 0; i < v; i++) {
            if(visited[i] == false)
                if(dfsrec(adj,i,visited,recst) == true)
                    return true;

        }
        return false;

    }
    static void addEdge(ArrayList<ArrayList<Integer>> adj, int u, int v){
        adj.get(u).add(v);
        adj.get(v).add(u);
    }
    public static void main(String[] args) {
        int V = 6;
        ArrayList<ArrayList<Integer> > adj = new ArrayList<ArrayList<Integer>>(V);
        for (int i = 0; i < V; i++)
            adj.add(new ArrayList<Integer>());

        addEdge(adj,0,1);
        addEdge(adj,2,1);
        addEdge(adj,2,3);
        addEdge(adj,3,4);
        addEdge(adj,4,5);
        addEdge(adj,5,3);
        System.out.println(dfs(adj,V));
    }

}
