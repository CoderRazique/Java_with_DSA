public class LastOccurence {
    public static int lstOccurence(int[] arr, int key, int i) {
        if (i == arr.length - 1) {
            return -1;
        }
        int isFound = lstOccurence(arr, key, i + 1);
        if (isFound == -1 && arr[i] == key) {
            return i;
        }
        return isFound;
    }

    public static void main(String[] args) {
        int[] arr = { 8, 3, 6, 9, 5, 10, 2, 5, 3 };
        int key = 5;
        int index = lstOccurence(arr, key, 0);
        if (index == -1) {
            System.out.println("Key is not found!");
        } else {
            System.out.println("Key is index number : " + index);
        }
    }
}
