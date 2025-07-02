// Reverse a string using Stack
// simple input = "abc"
// output : "cba"

import java.util.*;

public class ReverseStr_Stack {
    public static String reverseStr(String str) {
        Stack<Character> s = new Stack<>();
        int idx = 0;
        while (idx < str.length()) {
            s.push(str.charAt(idx));
            idx++;
        }

        StringBuilder result = new StringBuilder("");
        while (!s.isEmpty()) {
            result.append(s.pop());
        }
        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println(reverseStr("abdul Razique"));
    }
}
