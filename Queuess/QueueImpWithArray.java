// Queue implementation with array

public class QueueImpWithArray {

    static class Queue {
        static int arr[];
        static int size;
        static int rear;

        Queue(int n) {
            arr = new int[n];
            size = n;
            rear = -1;

        }

        boolean isEmpty() {
            return rear == -1;
        }

        boolean isFull() {
            return rear == size - 1;
        }

        void enque(int data) {
            if (isFull()) {
                System.out.println("Queue is full");
                return;
            }
            rear = rear + 1;
            arr[rear] = data;
        }

        int dequeue() {
            if (isEmpty()) {
                System.out.println("Queue is empty : ");
                return -1;
            }
            int front = arr[0];
            for (int i = 0; i < rear; i++) {
                arr[i] = arr[i + 1];
            }
            rear = rear - 1;
            return front;
        }

        int peek() {
            if (isEmpty()) {
                System.out.println("Queue is empty : ");
                return -1;
            }
            return arr[0];
        }
    }

    public static void main(String[] args) {
        Queue q = new Queue(5);
        q.enque(1);
        q.enque(2);
        q.enque(3);

        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.dequeue();
        }
    }
}
