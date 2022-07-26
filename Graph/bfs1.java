import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class bfs1 {
   static void bfs(ArrayList<ArrayList<Integer>> adj, int v) {
       int s = 0;
       boolean[] visited = new boolean[v + 1];
       Queue<Integer> q = new LinkedList<Integer>();
       visited[s] = true;
       q.add(s);
       while (q.isEmpty() == false) {
           int u = q.poll();
           System.out.print(u + " ");
           for (int a : adj.get(u)) {
               if (visited[a] == false) {
                   visited[a] = true;
                   q.add(a);
               }
           }
       }
   }
    static void addEdge(ArrayList<ArrayList<Integer>> adj, int u, int v){
        adj.get(u).add(v);
        adj.get(v).add(u);
    }

    public static void main(String[] args) {
        int v = 5;
        ArrayList<ArrayList<Integer>> adj = new ArrayList<ArrayList<Integer>>(v);
        for (int i = 0; i < v; i++) {
            adj.add(new ArrayList<Integer>());
        }
        addEdge(adj,0,1);
        addEdge(adj,0,2);
        addEdge(adj,1,2);
        addEdge(adj,1,3);
        addEdge(adj,3,2);
        bfs(adj,v);
    }

}
