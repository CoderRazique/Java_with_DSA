// Merge sort on LL

public class MergeSort {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;

    // add node
    public void addNode(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    // print ll
    public void printLinkedList() {
        if (head == null) {
            System.out.println("Linked list is empty : ");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public Node midFind(Node head) {
        Node slow = head;
        Node fast = head.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public Node reverse(Node head) {
        if (head == null || head.next == null) {
            return head;
        }
        Node newNode = reverse(head.next);
        Node temp = head.next;
        temp.next = head;
        head.next = null;
        return newNode;
    }

    public Node mergeSort(Node head) {
        if (head == null || head.next == null) {
            return head;
        }
        // find mid
        Node mid = midFind(head);
        // left and right MS
        Node rh = mid.next;
        mid.next = null;
        Node newLeft = mergeSort(head);
        Node newRight = mergeSort(rh);
        return merge(newLeft, newRight);
    }

    public Node merge(Node lh, Node rh) {
        Node mergedLL = new Node(-1);
        Node temp = mergedLL;
        while (lh != null && rh != null) {
            if (lh.data <= rh.data) {
                temp.next = lh;
                lh = lh.next;
                temp = temp.next;
            } else {
                temp.next = rh;
                rh = rh.next;
                temp = temp.next;
            }
        }
        while (lh != null) {
            temp.next = lh;
            lh = lh.next;
            temp = temp.next;
        }
        while (rh != null) {
            temp.next = lh;
            rh = rh.next;
            temp = temp.next;
        }
        return mergedLL.next;
    }

    public static void main(String[] args) {
        MergeSort ll = new MergeSort();
        ll.addNode(1);
        ll.addNode(2);
        ll.addNode(3);
        ll.addNode(4);
        // ll.addNode(5);

        ll.printLinkedList();
        head = ll.mergeSort(head);
        ll.printLinkedList();

    }
}
