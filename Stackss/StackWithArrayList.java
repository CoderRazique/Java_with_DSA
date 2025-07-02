// Create Stack using array list

import java.util.ArrayList;

public class StackWithArrayList {
    static class Stack {
        static ArrayList<Integer> list = new ArrayList<>();

        boolean isEmpty() {
            return list.size() == 0;
        }

        void push(int data) {
            list.add(data);
        }

        int pop() {
            if (isEmpty()) {
                System.out.println("Stack is empty!");
                return list.size();
            }
            int top = list.get(list.size() - 1);
            list.remove(list.size() - 1);
            return top;
        }

        int peek() {
            if (isEmpty()) {
                System.out.println("Stack is empty!");
                return list.size();
            }
            return list.get(list.size() - 1);
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
