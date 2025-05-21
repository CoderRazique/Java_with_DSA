// Create Node

public class CreateLinkedList {

    // create node
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    // Add node from first
    // TC = O(1)
    public void addFirst(int data) {
        // Step1 - create new node
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }
        // step2 - newNode->next = head
        newNode.next = head;

        // step3 - head = newNode
        head = newNode;
    }

    // Add node from last
    // TC = O(1)
    public void addLast(int data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }

    // print linked list
    // TC=O(n)
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

    // Add in the Middle
    // TC = O(n)
    public void addMiddle(int data, int idx) {
        if (idx == 0) {
            System.out.println("LL is empty! So there first node = tail node = middle node...");
            addFirst(data);
            return;
        }
        Node newNode = new Node(data);
        size++;
        Node temp = head;
        int c = 0;
        while (c < idx - 1) {
            c++;
            temp = temp.next;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }

    // Remove first node
    // TC = O(1)
    public int removeFirst() {
        if (size == 0) {
            System.out.println("LL is empty.");
            return Integer.MIN_VALUE;
        } else if (size == 1) {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        int val = head.data;
        head = head.next;
        size--;
        return val;
    }

    // remove last node
    // TC = O(n)
    public int removelast() {
        if (size == 0) {
            System.out.println("LL is empty!");
            return Integer.MIN_VALUE;
        } else if (size == 1) {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        Node prev = head;
        // priv : i = size - 2;
        for (int i = 0; i < size - 2; i++) {
            prev = prev.next;
        }
        int val = prev.next.data;
        prev.next = null;
        tail = prev;
        size--;
        return val;
    }

    public static void main(String[] args) {
        CreateLinkedList ll = new CreateLinkedList();
        ll.addFirst(2);
        ll.addFirst(1);
        ll.addLast(3);
        ll.addLast(4);
        ll.addMiddle(9, 2);
        ll.printLinkedList();
        System.out.println("Remove element from first : " + ll.removeFirst());
        ll.printLinkedList();
        System.out.println("Remove element from last : " + ll.removelast());
        ll.printLinkedList();
        System.out.println("Size of linkedList : " + size);
    }
}
