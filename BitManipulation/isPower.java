// check if a number is a Power of 2 or not.

public class isPower {
    public static boolean isPowerOfTwo(int n) {
        return (n & (n - 1)) == 0;
    }

    public static void main(String[] args) {
        if (isPowerOfTwo(16)) {
            System.out.println("Yes this numbder is power of 2!");
        } else {
            System.out.println("No this numbder is not power of 2!");

        }
    }
}
