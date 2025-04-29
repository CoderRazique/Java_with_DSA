//  clear last i bits
//  n = 1111, i=2 ,output : 1100

public class clearIBits {

    public static int clearLIBits(int n, int i) {
        int bitMask = ~(0) << i;
        return (n & bitMask);
    }

    public static void main(String[] args) {
        System.out.println(clearLIBits(10, 2));
        System.out.println(clearLIBits(15, 2));
    }
}
