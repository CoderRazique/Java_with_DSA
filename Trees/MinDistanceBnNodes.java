// Min Distance between nodes
//        1
//      /   \
//     2     3
//    / \   / \
//   4   5 6   7
//TC = O(n)

public class MinDistanceBnNodes {

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

    public static Node lca(Node root, int n1, int n2) {
        if (root == null || root.data == n1 || root.data == n2) {
            return root;
        }
        Node leftLca = lca(root.left, n1, n2);
        Node rightLca = lca(root.right, n1, n2);

        if (rightLca == null) {
            return leftLca;
        }
        if (leftLca == null) {
            return rightLca;
        }
        return root;
    }

    public static int lcaDistance(Node root, int n) {
        if (root == null) {
            return -1;
        }
        if (root.data == n) {
            return 0;
        }
        int leftDis = lcaDistance(root.left, n);
        int rightDis = lcaDistance(root.right, n);
        if (leftDis == -1 && rightDis == -1) {
            return -1;
        } else if (leftDis == -1) {
            return rightDis + 1;
        } else {
            return leftDis + 1;
        }
    }

    public static int minDistance(Node root, int n1, int n2) {
        Node lca = lca(root, n1, n2);
        int distance1 = lcaDistance(lca, n1);
        int distance2 = lcaDistance(lca, n2);

        return distance1 + distance2;
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        int n1 = 7, n2 = 2;
        System.out.println(minDistance(root, n1, n2));
    }
}
