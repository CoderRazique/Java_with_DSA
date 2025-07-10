// Heigth of a tree
//        1
//      /   \
//     2     3
//    / \   / \
//   4   5 6   7
//TC = O(n^2)

public class DiameterOfTree {

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

    static int heightTree(Node root) {
        if (root == null) {
            return 0;
        }
        int lh = heightTree(root.left);
        int rh = heightTree(root.right);
        return Math.max(lh, rh) + 1;
    }

    static int diameter(Node root) {
        if (root == null) {
            return 0;
        }

        int ldiam = diameter(root.left);
        int lh = heightTree(root.left);
        int rdiam = diameter(root.right);
        int rh = heightTree(root.right);
        int selfDiam = lh + rh + 1;
        return Math.max(selfDiam, Math.max(ldiam, rdiam));
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        System.out.println(diameter(root));
    }
}
