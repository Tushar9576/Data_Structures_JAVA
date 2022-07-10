public class nodesatdistk {
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
        printkdist(root,1);
    }
    static void printkdist(Node root, int k){
        if(root == null ){
            return ;
        }
        if(k == 0){
            System.out.print(root.key + " ");
        }
        else{
            printkdist(root.left, k - 1);
            printkdist(root.right, k - 1);
        }

    }
}
