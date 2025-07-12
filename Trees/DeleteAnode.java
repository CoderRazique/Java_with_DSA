// Delete a node

public class DeleteAnode {
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

    public static void inorderTree(Node root) {
        if (root == null) {
            return;
        }

        inorderTree(root.left);
        System.out.print(root.data + " ");
        inorderTree(root.right);
    }

    public static Node deletNode(Node root, int key) {
        if (root.data < key) {
            root.right = deletNode(root.right, key);
        } else if (root.data > key) {
            root.left = deletNode(root.left, key);
        } else { // voila
            // case 1 - leaf node
            if (root.left == null && root.right == null) {
                return null;
            }

            // case 2 - single child

            if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            }

            // case 3 - both children
            Node IS = findInorderSuccessor(root.right);
            root.data = IS.data;
            root.right = deletNode(root.right, IS.data);
        }
        return root;
    }

    public static Node findInorderSuccessor(Node root) {
        while (root.left != null) {
            root = root.left;
        }
        return root;
    }

    public static void main(String[] args) {
        int[] values = { 8, 5, 3, 1, 4, 6, 10, 11, 14 };
        Node root = null;
        int key = 1;

        for (int i = 0; i < values.length; i++) {
            root = insertNode(root, values[i]);
        }
        inorderTree(root);
        System.out.println();

        deletNode(root, key);
        System.out.println();

        inorderTree(root);
    }
}
