
public class PrintNto1 {
    public static void printNTo1(int n) {
        if (n == 1) {
            System.out.println(n);
            return;
        }
        System.out.print(n + " ");
        printNTo1(n - 1);
    }

    public static void main(String[] args) {
        printNTo1(10);
    }
}
