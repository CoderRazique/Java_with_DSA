// WAF to find first occurence of an element in an array

public class FirstOccurence {
    public static int frstOccurence(int[] arr, int key, int i) {

        if (i == arr.length - 1) {
            return -1;
        }

        if (arr[i] == key) {
            return i;
        }
        return frstOccurence(arr, key, i + 1);
    }

    public static void main(String[] args) {
        int[] arr = { 8, 3, 6, 9, 5, 10, 2, 5, 3 };
        int key = 5;
        int index = frstOccurence(arr, key, 0);
        if (index == -1) {
            System.out.println("Key is not found!");
        } else {
            System.out.println("Key is index number : " + index);
        }
    }
}
