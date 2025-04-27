// For a given set of string, print the largest string.

public class largestString {
    public static void main(String[] args) {
        String fruits[] = { "apple", "banana", "mango" };

        String largestStr = fruits[0];

        for (int i = 1; i < fruits.length; i++) {
            if (0 > largestStr.compareTo(fruits[i])) {
                largestStr = fruits[i];
            }
        }

        System.out.println("Largest string : " + largestStr);
    }
}
