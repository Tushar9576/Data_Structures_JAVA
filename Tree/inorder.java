public class inorder {
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
            inorder(root);

    }
    static void inorder(Node root){
        if(root != null){
            inorder(root.left);
            System.out.print(root.key+ " ");
            inorder(root.right);
        }
    }
}
