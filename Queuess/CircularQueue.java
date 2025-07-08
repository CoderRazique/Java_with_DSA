// Circular Queue implementation with array

public abstract class CircularQueue {

    static class Queue {
        static int arr[];
        static int size;
        static int rear;
        static int front;

        Queue(int n) {
            arr = new int[n];
            size = n;
            rear = -1;
            front = -1;

        }

        boolean isEmpty() {
            return rear == -1 && front == -1;
        }

        boolean isFull() {
            return (rear + 1) % size == front;
        }

        void enque(int data) {
            if (isFull()) {
                System.out.println("Queue is full");
                return;
            }
            if (front == -1) {
                front = 0;
            }
            rear = (rear + 1) % size;
            arr[rear] = data;
        }

        int dequeue() {
            if (isEmpty()) {
                System.out.println("Queue is empty : ");
                return -1;
            }
            int result = arr[front];
            if (front == rear) {
                front = rear = -1;
            } else {
                front = (front + 1) % size;
            }

            return result;
        }

        int peek() {
            if (isEmpty()) {
                System.out.println("Queue is empty : ");
                return -1;
            }
            return arr[front];
        }
    }

    public static void main(String[] args) {
        Queue q = new Queue(3);
        q.enque(1);
        q.enque(2);
        q.enque(3);
        System.out.println(q.dequeue());
        q.enque(4);
        System.out.println(q.dequeue());
        q.enque(5);

        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.dequeue();
        }
    }
}
