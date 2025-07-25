// Interleave 2 halves of a Queue (even or odd length)
// Input : 1,2,3,4,5,6,7,8,9,10;
// output : 1,6,2,7,3,8,4,9,5,10;

import java.util.LinkedList;
import java.util.Queue;

public class Interleave2halves {
    public static void interLeave(Queue<Integer> q) {
        Queue<Integer> firstHalf = new LinkedList<>();
        int size = q.size();
        for (int i = 0; i < (size + 1) / 2; i++) {
            firstHalf.add(q.remove());
        }
        while (!firstHalf.isEmpty()) {
            q.add(firstHalf.remove());
            if (!firstHalf.isEmpty()) {
                q.add(q.remove());
            }
        }
    }

    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);
        q.add(7);
        q.add(8);
        q.add(9);
        q.add(10);
        q.add(11);
        System.out.println(q);
        interLeave(q);
        System.out.println(q);
    }
}
