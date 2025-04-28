// odd or even

public class checkOddOrEven {

    public static void isOddEven(int n) {
        int bitMask = 1;
        if ((n & bitMask) == 0) {
            System.out.println("Even number");
        } else {
            System.out.println("Odd number");
        }
    }

    public static void main(String[] args) {
        isOddEven(10);
        isOddEven(11);
        isOddEven(7);
        isOddEven(34);
    }
}
