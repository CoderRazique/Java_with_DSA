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

    // Add node from first
    // TC = O(1)
    public void addFirst(int data) {
        // Step1 - create new node
        Node newNode = new Node(data);
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
        Node newNode = new Node(data);
        if (head == null) {
            System.out.println("LL is empty! So there first node = tail node = middle node...");
            addFirst(data);
            return;
        }
        Node temp = head;
        int c = 0;
        while (c < idx - 1) {
            c++;
            temp = temp.next;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }

    public static void main(String[] args) {
        CreateLinkedList ll = new CreateLinkedList();
        ll.addFirst(2);
        ll.addFirst(1);
        ll.addLast(3);
        ll.addLast(4);
        ll.addMiddle(9, 2);
        ll.printLinkedList();
    }
}
