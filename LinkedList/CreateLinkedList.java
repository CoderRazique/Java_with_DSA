// Create Node

public class CreateLinkedList {
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

    public void addFirst(int data) { // TC = O(1)
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

    public static void main(String[] args) {
        CreateLinkedList ll = new CreateLinkedList();
        ll.addFirst(1);
        ll.addFirst(2);

    }
}
