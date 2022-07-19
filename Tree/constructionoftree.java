
//  Construction of a Tree from inorder and postorder traversal
// Note:- For the construction of tree inorder traversal is must wih any other traversal
public class constructionoftree {
    static class Node{
        int key;
        Node left;
        Node right;
        public Node(int k) {
            key = k;
        }
    }
    public static void main(String[] args) {
//        Node root = new Node(10);
//        root.left = new Node(20);
//        root.right = new Node(30);
//        root.left.left = new Node(8);
//        root.left.right = new Node(7);
//        root.left.right.left = new Node(9);
//        root.left.right.right = new Node(15);
//        root.right.right  =new Node(6);
        int[] in = {20, 10, 40, 30, 50};
        int[] pre = {10, 20, 30,40,50};

        Node root = ctree(in,pre,0,in.length - 1);
        inorder(root);
    }
    static  int preIndex = 0;
    static Node ctree(int[] in, int[] pre, int is, int ie){
        if(is > ie)
            return null;
        Node root = new Node(pre[preIndex++]);
        int inIndex = 0;
        for (int i = 0; i <= ie; i++) {
            if(in[i] == root.key){
                inIndex = i;
                break;
            }
        }
        root.left = ctree(in,pre,is,inIndex -1 );
        root.right = ctree(in, pre, inIndex + 1, ie);
        return root;
    }
    public static void inorder(Node root){
        if(root != null){
            inorder(root.left);
            System.out.print(root.key+" ");
            inorder(root.right);
        }
    }

}
