//  Doubly Linked List basics operations

public class DoublyLL {
    public class Node {
        int data;
        Node next;
        Node prev;

        public Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    public void addFirst(int data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }

    public void addLast(int data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        newNode.prev = tail;
        tail = newNode;
    }

    public int removeFirst() {
        if (head == null) {
            System.out.println("DLL is empty!");
            return Integer.MIN_VALUE;
        }
        if (head.next == null && tail.prev == null) {
            int data = head.data;
            head = tail = null;
            size--;
            return data;
        }
        int data = head.data;
        head = head.next;
        head.prev = null;
        size--;
        return data;
    }

    public int removeLast() {
        if (head == null) {
            System.out.println("DLL is empty!");
            return Integer.MIN_VALUE;
        }
        if (head.next == null && tail.prev == null) {
            int data = head.data;
            head = tail = null;
            size--;
            return data;
        }
        int data = tail.data;
        tail = tail.prev;
        tail.next = null;
        size--;
        return data;

    }

    public void printDLL() {
        if (head == null && tail == null) {
            System.out.println("Doubly linked list is empty!");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " <-> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        DoublyLL dll = new DoublyLL();
        dll.addFirst(1);
        dll.addFirst(2);
        dll.addFirst(3);
        dll.addFirst(4);
        dll.addLast(0);
        dll.printDLL();
        System.out.println(dll.removeFirst() + " is successfully remove from first.");
        dll.printDLL();
        System.out.println(dll.removeLast() + " is successfully remove from last.");
        dll.printDLL();
        System.out.println("Size of DLL : " + size);
    }
}
