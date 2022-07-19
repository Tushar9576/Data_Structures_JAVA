
// This is a naive solution
// TC : O(n^2)

public class isbalanced1 {
    static class Node{
        int key;
        Node left;
        Node right;
        public Node(int k) {
            key = k;
        }
    }

    public static void main(String[] args) {
        Node root = new Node(18);
        root.left = new Node(4);
        root.right = new Node(20);
        root.right.left  =new Node(14);
        root.right.right  =new Node(70);
        System.out.println(isbalanced(root));

    }
    static int height(Node root){
        if(root == null){
            return 0;
        }
        else {
            return Math.max(height(root.left), height(root.right)) + 1 ;
        }

    }
    static boolean isbalanced(Node root){
        if(root == null)
            return true;
        int lh = height(root.left);
        int rh = height(root.right);

        return (Math.abs(lh - rh) <= 1 && isbalanced(root.left) && isbalanced(root.right));

    }
}
