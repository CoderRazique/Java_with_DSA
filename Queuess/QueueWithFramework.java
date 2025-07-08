// Create queue using java collection freamwork

import java.util.LinkedList;
import java.util.Queue;

public class QueueWithFramework {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>(); // ArrayDeque<>();

        q.add(1);
        q.add(2);
        q.add(3);

        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }
    }
}
