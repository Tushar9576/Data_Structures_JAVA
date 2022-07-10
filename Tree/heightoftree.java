public class heightoftree {
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
        root.left.left.right  =new Node(90);
        System.out.println( height(root));
    }
    static int height(Node root){
        if(root == null){
            return 0;
        }
        else {
            return Math.max(height(root.left), height(root.right)) + 1 ;
        }

    }
}
