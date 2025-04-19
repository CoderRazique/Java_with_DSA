//  Linear search looking a key in a array

public class linearSearch {
    public static int LinearSearch(int key, int[] num) {
        for (int i = 0; i < num.length; i++) {
            if (num[i] == key) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] numbers = { 23, 34, 10, 53, 8, 57, 7, 10 };
        int key = 5;
        int index = LinearSearch(key, numbers);
        System.out.println("Key is at index " + index);
    }
}
