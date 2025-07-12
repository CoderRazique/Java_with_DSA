// The next greater element of some element x in an array is
// the first greater element that is to the right of x in the same array
// Input arr = [6, 8, 0, 1, 3]
// output nextGreater = [8, -1, 1, 3, -1]

import java.util.Stack;

public class NextGreaterEle {
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        int[] arr = { 6, 8, 0, 1, 3 };
        int[] nextGreater = new int[arr.length];

        for (int i = arr.length - 1; i >= 0; i--) {
            while (!s.isEmpty() && arr[s.peek()] <= arr[i]) {
                s.pop();
            }
            if (s.isEmpty()) {
                nextGreater[i] = -1;
            } else {
                nextGreater[i] = arr[s.peek()];
            }
            s.push(i);

        }

        for (int i = 0; i < nextGreater.length; i++) {
            System.out.print(nextGreater[i] + " ");
        }
    }
}
