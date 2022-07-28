import java.util.ArrayList;

// Cycle detection for an Undirected Graph
// You can use BFS also for this problem and maintain a parent variable
// But I have used DFS

public class cycledetection {
    static boolean dfsrec (ArrayList<ArrayList<Integer>> adj, int s, boolean[] visited, int parent){
        visited[s] = true;
        System.out.print(s + " ");
        for (int u: adj.get(s)) {
            if(visited[u] ==  false){
                if(dfsrec(adj,u,visited,-1) == true){
                    return true;
                } else if (u != parent) {
                    return true;
                }
            }
        }
        return false;
    }
    static boolean dfs(ArrayList<ArrayList<Integer>> adj, int v){
        boolean[] visited = new boolean[v];
        for (int i = 0; i < v; i++) {
            if(visited[i] == false){
                if(dfsrec(adj,i,visited,-1) == true){
                    return true;
                }
            }
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
        addEdge(adj,1,2);
        addEdge(adj,2,4);
        addEdge(adj,4,5);
        addEdge(adj,1,3);
        addEdge(adj,2,3);
        System.out.println(dfs(adj,V));
    }
}
