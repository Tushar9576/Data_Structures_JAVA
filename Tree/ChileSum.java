// The value of every Node should be equal to the sum of its child Nodes [both left and right]

public class childsum {
    static class Node{
        int key;
        Node left;
        Node right;
        public Node(int k) {
            key = k;
        }
    }
    public static void main(String[] args) {
        Node root = new Node(50);
        root.left = new Node(20);
        root.right = new Node(30);
//        root.left.left = new Node(8);
//        root.left.right = new Node(7);
//        root.left.right.left = new Node(9);
//        root.left.right.right = new Node(15);
//        root.right.right  =new Node(6);
        System.out.print(ischildsum(root));
    }
    static boolean ischildsum(Node root){
        if(root == null){
            return true;
        }
        if(root.left == null && root.right == null){
            return true;
        }
        int sum = 0;
        if(root.left != null){
            sum += root.left.key;
        }
        if(root.right != null){
            sum += root.right.key;
        }
        return (root.key == sum && ischildsum(root.left) && ischildsum(root.right));
    }
}
