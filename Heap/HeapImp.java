// Insert in heap

import java.util.ArrayList;

public class HeapImp {
    static class Heap {
        ArrayList<Integer> arr = new ArrayList<>();

        public void add(int data) { //
            // add at last
            arr.add(data);

            int childIdx = arr.size() - 1;
            int parentIdx = (childIdx - 1) / 2;

            while (arr.get(parentIdx) > arr.get(childIdx)) {
                int temp = arr.get(childIdx);
                arr.set(childIdx, arr.get(parentIdx));
                arr.set(parentIdx, temp);
                // update
                childIdx = parentIdx;
                parentIdx = (childIdx - 1) / 2;
            }
        }

        public int peek() {
            return arr.get(0);
        }

        private void heapify(int idx) {
            int left = 2 * idx + 1;
            int right = 2 * idx + 2;
            int minIdx = idx;

            if (left < arr.size() && arr.get(minIdx) > arr.get(left)) {
                minIdx = left;
            }

            if (right < arr.size() && arr.get(minIdx) > arr.get(right)) {
                minIdx = right;
            }

            if (minIdx != idx) {
                // swap
                int temp = arr.get(minIdx);
                arr.set(minIdx, arr.get(idx));
                arr.set(idx, temp);

                heapify(minIdx);
            }
        }

        public int remove() { // O(logn)
            int data = arr.get(0);

            // Swap firs and last
            int temp = arr.get(0);
            arr.set(0, arr.get(arr.size() - 1));
            arr.set(arr.size() - 1, temp);

            // remove last
            arr.remove(arr.size() - 1);

            // call heapify function
            heapify(0);

            return data;
        }

        public boolean isEmpty() {
            return arr.size() == 0;
        }
    }

    public static void main(String[] args) {
        Heap h = new Heap();
        h.add(3);
        h.add(4);
        h.add(1);
        h.add(5);

        while (!h.isEmpty()) {
            System.out.println(h.peek());
            h.remove();
        }
    }
}
