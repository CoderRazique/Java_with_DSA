// Sum of Nodes of a tree
//        1
//      /   \
//     2     3
//    / \   / \
//   4   5 6   7
//TC = O(n)

public class SumOfNodes {

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

    static int sumOfNode(Node root) { // O(n)
        if (root == null) {
            return 0;
        }
        int sunOfLeftNofe = sumOfNode(root.left);
        int sumOfRightNode = sumOfNode(root.right);
        return sunOfLeftNofe + sumOfRightNode + root.data;
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        System.out.println(sumOfNode(root));
    }
}
