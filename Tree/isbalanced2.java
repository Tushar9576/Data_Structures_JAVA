
// This is an optmized solution
// TC : O(n)
public class isbalanced2 {
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
    static int isbalanced(Node root){
        if(root == null)
            return 0;
        int lh = isbalanced(root.left);
        if(lh == -1)
            return -1;
        int rh = isbalanced(root.right);
        if(rh == -1)
            return -1;
        if(Math.abs(lh - rh) > 1){
            return -1;
        }
        else{
            return Math.max(lh,rh) + 1;
        }
    }
}
