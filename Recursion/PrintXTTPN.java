// Print X^n

public class PrintXTTPN {
    public static int pow(int x, int n) {
        if (n == 0) {
            return 1;
        }
        return x * pow(x, n - 1);
    }

    public static void main(String[] args) {
        int x = 25;
        int n = 2;
        System.out.println(pow(x, n));
    }
}
