// Zig-Zag Linked List

public class Zig_ZagLL {
    public class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;

    public void add(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public static Node midFind(Node head) {
        Node slow = head;
        Node fast = head.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public static Node reverse(Node head) {
        if (head == null || head.next == null) {
            return head;
        }

        Node newNode = reverse(head.next);
        Node temp = head.next;
        temp.next = head;
        head.next = null;
        return newNode;
    }

    public static void zig_ZagLL() {
        Node mid = midFind(head);
        Node lastH = mid.next;
        mid.next = null;
        Node lh = head;
        Node rh = reverse(lastH);
        Node nextL, nextR;
        while (rh != null && lh != null) {
            nextL = lh.next;
            lh.next = rh;
            nextR = rh.next;
            rh.next = nextL;
            lh = nextL;
            rh = nextR;
        }
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

    public static void main(String[] args) {
        Zig_ZagLL ll = new Zig_ZagLL();
        ll.add(1);
        ll.add(2);
        ll.add(3);
        ll.add(4);
        ll.add(5);
        ll.add(6);

        ll.printLinkedList();
        zig_ZagLL();
        ll.printLinkedList();
    }
}
