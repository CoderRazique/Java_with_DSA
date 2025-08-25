// Size of largest BST in binary tree

//      Input:                Output:
//             50                   60
//           /   \                /  \
//         30    60             45    70
//        / \    / \                 /  \
//       5  20 45  70               65   80
//                /  \             size = 5
//              65   80

public class SizeOfLrgBST {
    static class Node {
        int data;
        Node left;
        Node righr;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.righr = null;
        }

    }

    static class Info {
        boolean isBST;
        int size;
        int min;
        int max;

        public Info(boolean isBST, int size, int min, int max) {
            this.isBST = isBST;
            this.size = size;
            this.min = min;
            this.max = max;
        }
    }

    static int maxBST = 0;

    public static Info largestBST(Node root) {
        if (root == null) {
            return new Info(true, 0, Integer.MAX_VALUE, Integer.MIN_VALUE);
        }

        Info leftInfo = largestBST(root.left);
        Info rightInfo = largestBST(root.righr);
        int size = leftInfo.size + rightInfo.size + 1;
        int min = Math.min(root.data, Math.min(leftInfo.min, rightInfo.min));
        int max = Math.max(root.data, Math.max(leftInfo.max, rightInfo.max));

        if (root.data <= leftInfo.max || root.data >= rightInfo.min) {
            return new Info(false, size, min, max);
        }

        if (leftInfo.isBST && rightInfo.isBST) {
            maxBST = Math.max(maxBST, size);
            return new Info(true, size, min, max);
        }

        return new Info(false, size, min, max);
    }

    public static void main(String[] args) {
        Node root = new Node(50);
        root.left = new Node(30);
        root.left.left = new Node(5);
        root.left.righr = new Node(20);

        root.righr = new Node(60);
        root.righr.left = new Node(45);
        root.righr.righr = new Node(70);
        root.righr.righr.left = new Node(65);
        root.righr.righr.righr = new Node(80);

        Info info = largestBST(root);
        System.out.println("Largest BST size = " + maxBST);
    }
}
