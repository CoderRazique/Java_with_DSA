//  Linear search looking a key in a array
//Find the index of element in a given array

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
        int key = 57;
        int index = LinearSearch(key, numbers);
        if (index == -1) {
            System.out.println("Key is NOT found!");

        } else {
            System.out.println("Key is at index " + index);

        }
    }
}
