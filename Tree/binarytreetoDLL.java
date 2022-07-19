
// Convert a Binary Tree to Doubly LinkedList
public class binarytreetoDLL {
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
        Node head = BTtoDLL(root);
        printlist(head);

    }
    static  Node prev = null;
    static Node BTtoDLL(Node root){
        if(root == null)
            return root;
        Node head = BTtoDLL(root.left);
        if(prev == null)
            head = root;
        else{
            root.left = prev;
            root.right = root;
        }
        prev = root;
        BTtoDLL(root.right);
        return head;
    }
    public static void printlist(Node head){
        Node curr = head;
        while(curr != null){
            System.out.print(curr.key + " ");
            curr = curr.right;
        }
    }
}
