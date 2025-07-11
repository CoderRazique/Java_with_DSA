// Kth Ancestor of node
//        1
//      /   \
//     2     3
//    / \   / \
//   4   5 6   7
// intput : node = 5, k = 2
// output : 1
//TC = O(n)

public class KthAncestorOfNode {

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

    public static int kThAncestor(Node root, int node, int k) {
        if (root == null) {
            return -1;
        }

        if (root.data == node) {
            return 0;
        }

        int leftDis = kThAncestor(root.left, node, k);
        int rightDis = kThAncestor(root.right, node, k);

        if (leftDis == -1 && rightDis == -1) {
            return -1;
        }
        int max = Math.max(leftDis, rightDis);
        if (max + 1 == k) {
            System.out.println(root.data);
        }
        return max + 1;
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        int node = 5, k = 2;
        kThAncestor(root, node, k);
    }
}
