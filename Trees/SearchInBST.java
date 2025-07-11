// Search in BST

public class SearchInBST {

    public static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
        }
    }

    public static Node insert(int val, Node root) {
        if (root == null) {
            root = new Node(val);
            return root;
        }

        if (root.data > val) {
            root.left = insert(val, root.left);
        } else {
            root.right = insert(val, root.right);
        }

        return root;
    }

    public static boolean search(Node root, int key) {
        if (root == null) {
            return false;
        }

        if (root.data == key) {
            return true;
        }
        if (root.data > key) {
            return search(root.left, key);
        } else {
            return search(root.right, key);
        }
    }

    public static void main(String[] args) {
        int[] values = { 5, 1, 3, 4, 2, 7 };
        Node root = null;
        int key = 7;
        for (int index = 0; index < values.length; index++) {
            root = insert(values[index], root);
        }
        if (search(root, key)) {
            System.out.println("Found");
        } else {
            System.out.println("Not found");
        }
    }
}
