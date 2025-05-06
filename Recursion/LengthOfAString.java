// Question 3 :Write a program to find Length of a String using Recursion.

public class LengthOfAString {
    public static int FindLengthM1(String str) {
        if (str.length() == 0) {
            return 0;
        }
        return 1 + FindLengthM1(str.substring(1));

    }

    public static int FindLengthm2(String str, int i) {
        if (i == str.length()) {
            return 0;
        }
        return 1 + FindLengthm2(str, i + 1);

    }

    public static void main(String[] args) {
        String str = "Abdul Razique";
        System.out.println(" Method1 " + FindLengthM1(str));
        System.out.println(" Method2 " + FindLengthM1(str));
    }
}
