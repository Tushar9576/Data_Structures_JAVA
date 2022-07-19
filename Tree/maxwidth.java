import java.util.LinkedList;
import java.util.Queue;

public class maxwidth {
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
        System.out.println(width(root));
    }
    static int width (Node root){
        if(root == null)
            return 0;
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        int res = 0;
        while(q.isEmpty() == false){
            int count = q.size();
            res = Math.max(res,count);
            for (int i = 0; i < count; i++) {
                Node curr = q.poll();
                if(curr.left != null )
                    q.add(curr.left);
                if(curr.right != null)
                    q.add(curr.right);
            }
        }
        return res;
    }
}
