// Queue using Linked List

public class QueueWithLL {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static class Queue {
        static Node head = null;
        static Node tail = null;

        boolean isEmpty() {
            return head == null && tail == null;
        }

        // O(n)
        void add(int data) {
            Node newNode = new Node(data);
            if (head == null) {
                head = tail = newNode;
                return;
            }
            tail.next = newNode;
            tail = newNode;
        }

        // O(n)
        int delete() {
            if (head == null && tail == null) {
                System.out.println("Queue list is empty");
                return -1;
            }
            int deteteData = head.data;
            if (head == tail) {
                head = tail = null;
            } else {
                head = head.next;
            }
            return deteteData;
        }

        // O(n)
        int peek() {
            if (isEmpty()) {
                System.out.println("Queue list is empty!");
                return -1;
            }
            return head.data;
        }
    }

    public static void main(String[] args) {
        Queue q = new Queue();
        q.add(1);
        q.add(2);
        q.add(3);
        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.delete();
        }
    }
}
