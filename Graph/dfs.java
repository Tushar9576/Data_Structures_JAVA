import java.util.ArrayList;

public class dfs {
    static void dfsrec(ArrayList<ArrayList<Integer>> adj, int s, boolean[] visited){
        visited[s] = true;
        System.out.print(s + " ");
        for (int u: adj.get(s)) {
            if(visited[u] ==  false){
                dfsrec(adj,u,visited);
            }
            
        }
    }
    static void dfs(ArrayList<ArrayList<Integer>> adj, int v , int s) {
        boolean[] visited = new boolean[v];
        for (int i = 0; i < v; i++) {
            visited[i] = false;
        }
        for (int i = 0; i < v; i++) {
            if (visited[i] == false) {
                dfsrec(adj, i, visited);
            }
        }
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
        addEdge(adj,1,4);
        addEdge(adj,3,4);
        addEdge(adj,5,6);
        dfs(adj,v,0);

    }
}
