import java.util.LinkedList;
import java.util.Queue;

public class bfs {
    static class Node{
        int key;
        Node left;
        Node right;
        public Node(int k) {
            key = k;
        }
    }
    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(20);
        root.right = new Node(30);
        root.left.left = new Node(8);
        root.left.right = new Node(7);
        root.left.right.left = new Node(9);
        root.left.right.right = new Node(15);
        root.right.right  =new Node(6);
        printlevel(root);

    }
    static void printlevel(Node root){
        if(root == null){
            return;
        }
        Queue<Node> q = new LinkedList<Node>();
        q.add(root);
        while(q.isEmpty() == false){
            Node curr = q.poll();
            System.out.print(curr.key + " ");
            if(curr.left != null){
                q.add(curr.left);

            }
            if(curr.right != null){
                q.add(curr.right);
            }
        }
    }
}
