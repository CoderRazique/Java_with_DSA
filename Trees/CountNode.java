// Count Node of a tree
//        1
//      /   \
//     2     3
//    / \   / \
//   4   5 6   7
//TC = O(n)

public class CountNode {

    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static int countNode(Node root) {
        if (root == null) {
            return 0;
        }
        int ln = countNode(root.left);
        int rn = countNode(root.right);
        return ln + rn + 1;
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        // root.right.left = new Node(6);
        root.right.right = new Node(7);
        System.out.println(countNode(root));
    }
}
