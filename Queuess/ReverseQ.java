// Queue Reversal
//  input : 1,2,3,4,5;
// output : 5,4,3,2,1;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ReverseQ {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        Stack<Integer> s = new Stack<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        System.out.println(q);
        int size = q.size();
        while (!q.isEmpty()) {
            s.push(q.poll());
        }
        while (!s.isEmpty()) {
            q.add(s.pop());
        }
        System.out.println(q);
    }
}
