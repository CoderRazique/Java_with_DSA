// Check if LL is a Palindrom

public class LinkedList_isPalindrom {
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
        Node fast = head;
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

    public boolean isPalindrom() {
        if (head == null || head.next == null) {
            return true;
        }
        // stap 1 : find mid
        Node mid = midFind(head);
        // step 2 : reverse
        Node right = reverse(mid);
        Node left = head;
        while (right != null) {
            if (left.data != right.data) {
                return false;
            }
            left = left.next;
            right = right.next;
        }
        return true;
    }

    public static void main(String[] args) {
        LinkedList_isPalindrom ll = new LinkedList_isPalindrom();
        ll.addNode(1);
        ll.addNode(2);
        // ll.addNode(2);
        ll.addNode(1);
        // ll.addNode(1);

        ll.printLinkedList();
        System.out.println("Is Palindrom : " + ll.isPalindrom());
    }
}
