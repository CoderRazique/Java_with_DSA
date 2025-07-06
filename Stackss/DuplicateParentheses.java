// Check Duplicate Parentheses
// Input : Str = "(((a+(b)))+(c+d))", output : true
// Input : Str = "((a+b) + (c+d))", output : false

// TC = O(n)

import java.util.Stack;

public class DuplicateParentheses {

    public static boolean isDuplicate(String str) {
        Stack<Character> s = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch == ')') {
                // int count = 0;
                // while (s.peek() != '(') {
                // s.pop();
                // count++;
                // }
                // if (count < 1) {
                // return true; // Duplicate
                // } else {
                // s.pop(); // pop opening bracket '('
                // }

                int count = 0;
                while (s.pop() != '(') {
                    count++;
                }
                if (count < 1) {
                    return true; // Duplicate
                }
            } else {
                s.push(ch); // Opening, Operands, Operaters
            }
        }
        return false;
    }

    public static void main(String[] args) {
        String str = "((a+b) + (c+d))";
        String str2 = "(((a+b)) + (c+d))";

        System.out.println(isDuplicate(str));
        System.out.println(isDuplicate(str2));

    }
}
