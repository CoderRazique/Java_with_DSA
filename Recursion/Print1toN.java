// Print numbers from 1 to n (Increasing Order)

public class Print1toN {

    public static void printIncr(int n) {
        if (n == 1) {
            System.out.print(n + " ");
            return;
        }
        printIncr(n - 1);
        System.out.print(n + " ");
    }

    public static void main(String[] args) {
        printIncr(10);
    }
}
