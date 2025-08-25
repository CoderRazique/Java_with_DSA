// Merge 2 BSTs

//      Input:               
//             2                  9
//           /  \                / \
//          1    4              3  12
//      Output:
//         3
//       /  \
//     1     9
//     \    / \
//      2  4 12

import java.util.ArrayList;

public class Merge2BST {
    public static class Node {
        int data;
        Node left;
        Node righr;

        Node(int data) {
            this.data = data;
            this.left = this.righr = null;
        }
    }

    public static void getInorder(Node root, ArrayList<Integer> arr) {
        if (root == null) {
            return;
        }

        getInorder(root.left, arr);
        arr.add(root.data);
        getInorder(root.righr, arr);
    }

    public static Node createBST(ArrayList<Integer> mergeArr, int st, int end) {
        if (st > end) {
            return null;
        }
        int mid = (st + end) / 2;
        Node root = new Node(mergeArr.get(mid));
        root.left = createBST(mergeArr, st, mid - 1);
        root.righr = createBST(mergeArr, mid + 1, end);
        return root;
    }

    public static Node mergeBST(Node root1, Node root2) {
        // step 1
        ArrayList<Integer> arr1 = new ArrayList<>();
        getInorder(root1, arr1);
        // step 2
        ArrayList<Integer> arr2 = new ArrayList<>();
        getInorder(root2, arr2);
        // merge
        int i = 0, j = 0;
        ArrayList<Integer> mergeArr = new ArrayList<>();
        while (i < arr1.size() && j < arr2.size()) {
            if (arr1.get(i) <= arr2.get(j)) {
                mergeArr.add(arr1.get(i));
                i++;
            } else {
                mergeArr.add(arr2.get(j));
                j++;
            }
        }
        while (i < arr1.size()) {
            mergeArr.add(arr1.get(i));
            i++;
        }
        while (j < arr2.size()) {
            mergeArr.add(arr2.get(j));
            j++;
        }
        // Sorted Array List to Balanced Search Tree
        return createBST(mergeArr, 0, mergeArr.size() - 1);
    }

    public static void preOrder(Node root) {
        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.righr);
    }

    public static void main(String[] args) {
        // Tree 1st
        Node root1 = new Node(2);
        root1.left = new Node(1);
        root1.righr = new Node(4);
        // Tree 2nd
        Node root2 = new Node(9);
        root2.left = new Node(3);
        root2.righr = new Node(12);
        Node root = mergeBST(root1, root2);
        preOrder(root);
    }
}
