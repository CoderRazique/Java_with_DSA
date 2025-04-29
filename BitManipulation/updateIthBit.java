// Update Ith Bit

public class updateIthBit {

    public static int clearIthBitValue(int n, int i) {
        int bitMask = ~(1 << i);
        return (n & bitMask);
    }

    public static int updateBit(int n, int i, int newBit) {
        // if (newBit == 0) {
        // return clearIthBitValue(n, i);
        // } else {
        // return clearIthBitValue(n, i);
        // }

        n = clearIthBitValue(n, i);
        int newMark = newBit << i;
        return (newMark | n);
    }

    public static void main(String[] args) {
        System.out.println(updateBit(10, 2, 1));
        System.out.println(updateBit(15, 3, 0));
    }
}
