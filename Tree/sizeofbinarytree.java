public class sizeofbinarytree {
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
        System.out.print(sizeof(root));
    }
    static int sizeof(Node root){
        if(root == null){
            return 0;
        }
        else{
            return 1 + sizeof(root.left)+sizeof(root.right);
        }
    }
}
