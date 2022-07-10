
// This is a RECURSIVE Solution
public class printleftviewofbinarytree {
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
        printleftview(root);
    }
   static int maxlevel = 0;
    private static void printleft(Node root, int level){
        if(root == null){
            return;
        }
        if(maxlevel < level){
            System.out.print(root.key + " ");
            maxlevel = level;
        }
        printleft(root.left, level+1);
        printleft(root.right, level+1);
    }
    static void printleftview(Node root){
        printleft(root, 1);
    }
}
