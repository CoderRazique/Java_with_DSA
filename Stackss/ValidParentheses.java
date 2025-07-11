// Valid Parentheses 
// sample input : s = "({[]}())"
//  output  : true
// input : "(]" , output : false
// TC  = O(n)

import java.util.Stack;

public class ValidParentheses {
    public static boolean isValid(String str) {

        Stack<Character> s = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            Character ch = str.charAt(i);
            if (ch == '(' || ch == '{' || ch == '[') {
                s.push(ch);
            } else {
                if (s.isEmpty()) {
                    return false;
                }
                if ((s.peek() == '(' && ch == ')') ||
                        (s.peek() == '{' && ch == '}') ||
                        (s.peek() == '[' && ch == ']')) {
                    s.pop();
                } else {
                    return false;
                }
            }
        }
        if (s.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        String s = "({[]}())";
        System.out.println(isValid(s));
    }
}
