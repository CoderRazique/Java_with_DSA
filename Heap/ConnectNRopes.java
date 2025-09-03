// Connect N Ropes
// Given are N ropes of different lengths, the task is to connect these ropes into one rope with
// minimum cost, such that the cost to connect two ropes is equal to the sum of their lengths.
// ropes = {4,3,2,6};
// ans = 29
// connect 2 & 3 [5]
// connect 5 & 4 [9]
// connect 9 & 6 [15]
//            =  [29] ans

import java.util.PriorityQueue;

public class ConnectNRopes {
    public static void main(String[] args) {
        int ropes[] = { 4, 3, 2, 6, 3 };
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for (int i = 0; i < ropes.length; i++) {
            pq.add(ropes[i]);
        }

        int cost = 0;
        while (pq.size() > 1) {
            int min1st = pq.remove();
            int min2nd = pq.remove();
            cost += min1st + min2nd;
            pq.add(min1st + min2nd);
        }
        System.out.println("minimum cost of connecting n ropes : " + cost);
    }
}
