public class preorder {
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
        preorder(root);

    }
    static void preorder( Node root){
        if( root != null){
            System.out.print(root.key + " ");
            preorder(root.left);
            preorder(root.right);
        }
    }
}
