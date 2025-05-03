// Print sum of first n natural numbers.

public class SumOfNaturalNo {
    public static int sumOfnNaturalNum(int n) {
        if (n == 1) {
            return 1;
        }
        return n + sumOfnNaturalNum(n - 1);
    }

    public static void main(String[] args) {
        System.out.println("Sum of n natural number : " + sumOfnNaturalNum(10));
    }
}
