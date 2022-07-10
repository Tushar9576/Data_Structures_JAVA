public class postorder {
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
        root.left.left = new Node(50);
        postorder(root);
    }
    static void postorder( Node root){
        if( root != null){
            postorder(root.left);
            postorder(root.right);
            System.out.print(root.key + " ");
        }
    }
}
