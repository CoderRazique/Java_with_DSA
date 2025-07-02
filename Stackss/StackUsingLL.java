// Create Stack using Linked list

public class StackUsingLL {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static class Stack {
        static Node head = null;
        static int size = 0;

        boolean isEmpty() {
            return head == null;
        }

        void push(int data) {
            Node newNode = new Node(data);
            size++;

            if (isEmpty()) {
                head = newNode;
                return;
            }

            newNode.next = head;
            head = newNode;
        }

        int pop() {
            if (isEmpty()) {
                System.out.println("Stack is empty!");
                return size;
            }
            int top = head.data;
            head = head.next;
            size--;
            return top;
        }

        int peek() {
            if (isEmpty()) {
                System.out.println("Stack is empty!");
                return size;
            }
            return head.data;
        }
    }

    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);

        while (!s.isEmpty()) {
            System.out.println(s.peek() + " ");
            s.pop();
        }
        s.pop();

    }
}
