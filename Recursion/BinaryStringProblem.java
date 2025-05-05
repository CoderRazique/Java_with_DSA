// Binary String Problem
// Print all binary strings of size N without consecutive ones.

public class BinaryStringProblem {
    public static void printConsecutiveOnes(int n, int lastPlace, String str) {
        if (n == 0) {
            System.out.println(str);
            return;
        }

        printConsecutiveOnes(n - 1, 0, str + "0");
        if (lastPlace == 0) {
            printConsecutiveOnes(n - 1, 1, str + "1");
        }
    }

    public static void main(String[] args) {
        printConsecutiveOnes(3, 0, "");
    }
}
