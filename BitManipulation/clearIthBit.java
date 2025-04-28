// clear ith bit 

public class clearIthBit {
    public static int clearIthBitValue(int n, int i) {
        int bitMask = ~(1 << i);
        return (n & bitMask);
    }

    public static void main(String[] args) {
        System.out.println(clearIthBitValue(10, 2));
        System.out.println(clearIthBitValue(15, 3));
    }
}
