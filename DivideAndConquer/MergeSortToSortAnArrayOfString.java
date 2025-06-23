// Question1:
//  Apply Merge sort to sort an array of Strings.
//  (Assume that all the characters in all the Strings are in lowercase). (EASY)
// Sample Input 1: arr = { "sun", "earth", "mars", "mercury"}
// Sample Output 1: arr = { "earth", "mars", "mercury","sun"}

public class MergeSortToSortAnArrayOfString {
    public static String[] MergeSort(String[] arr, int st, int en) {
        if (st == en) {
            String[] A = { arr[st] };
            return A;
        }
        int mid = st + (en - st) / 2;
        String[] arr1 = MergeSort(arr, st, mid);
        String[] arr2 = MergeSort(arr, mid + 1, en);
        String[] arr3 = Merge(arr1, arr2);
        return arr3;
    }

    public static

    public static void main(String[] args) {
        String[] arr = { "sun", "earth", "mars", "mercury" };

    }
}
