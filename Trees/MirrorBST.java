// Mirror a BST

public class MirrorBST {

    public static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static Node mirrorBST(Node root) {
        if (root == null) {
            return null;
        }

        Node leftMirror = mirrorBST(root.left);
        Node rightMirror = mirrorBST(root.right);

        root.left = rightMirror;
        root.right = leftMirror;

        return root;
    }

    public static void preorder(Node root) {
        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }

    public static Node insertNode(Node root, int data) {
        if (root == null) {
            root = new Node(data);
            return root;
        }

        if (root.data > data) {
            root.left = insertNode(root.left, data);
        } else {
            root.right = insertNode(root.right, data);
        }
        return root;
    }

    public static void main(String[] args) {
        int[] values = { 8, 5, 3, 6, 10, 11 };
        Node root = null;

        for (int i = 0; i < values.length; i++) {
            root = insertNode(root, values[i]);
        }
        preorder(root);
        System.out.println();
        Node mirrorRoot = mirrorBST(root);
        preorder(mirrorRoot);
    }
}
