// Print Nth fibonacci number

public class Fibonacci {
    public static int fibonacci(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1 || n == 0) {
            return n;
        }
        int fnm1 = fibonacci(n - 1);
        int fnm2 = fibonacci(n - 2);
        int fn = fnm1 + fnm2;
        return fn;
        // return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {
        System.out.println(fibonacci(23));
        System.out.println(fibonacci(24));
        System.out.println(fibonacci(25));
        System.out.println(fibonacci(26));
        System.out.println(fibonacci(27));
    }
}
