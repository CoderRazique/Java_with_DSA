// Max Area In Histogram
// Input : arr = [2,1,5,6,2,3]
// Output : 10 {area = hi(5) * wi(2) }

import java.util.Stack;

public class MaxAreaInHistogram {

    public static void maxArea(int[] arr) {
        int maxArea = 0;
        int[] nsr = new int[arr.length];
        int[] nsl = new int[arr.length];

        Stack<Integer> s = new Stack<>();

        // Next smaller right
        for (int i = nsr.length - 1; i >= 0; i--) {
            while (!s.isEmpty() && arr[s.peek()] >= arr[i]) {
                s.pop();
            }
            if (s.isEmpty()) {
                nsr[i] = arr.length;
            } else {
                nsr[i] = s.peek();
            }
            s.push(i);
        }

        // Next Smaller Left
        s = new Stack<>();
        for (int i = 0; i < nsl.length; i++) {
            while (!s.isEmpty() && arr[s.peek()] >= arr[i]) {
                s.pop();
            }
            if (s.isEmpty()) {
                nsl[i] = -1;
            } else {
                nsl[i] = s.peek();
            }
            s.push(i);
        }

        for (int i = 0; i < arr.length; i++) {
            int height = arr[i];
            int width = (nsr[i] - nsl[i] - 1);
            int currtArea = height * width;
            maxArea = Math.max(maxArea, currtArea);
        }
        System.out.println("Max Area In Histogram : " + maxArea);
    }

    public static void main(String[] args) {
        // int[] arr = { 2, 1, 5, 6, 2, 3 };
        int[] arr = { 2, 4 };
        maxArea(arr);
    }
}
