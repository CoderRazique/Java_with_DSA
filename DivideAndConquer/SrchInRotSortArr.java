// Search in Rotated Sorted Array
// input: sorted, rotated array with distinct number (in ascending order)
// It is rotated at a pivot point. Find the index of given element.
// input []arr = {4,5,6,7,0,1,2}, target : 0
// output : 4

public class SrchInRotSortArr {

    public static int search(int[] arr, int tar, int si, int ei) {
        if (si > ei) {
            return -1;
        }

        // kaam
        int mid = si + (ei - si) / 2;

        // case FOUND
        if (arr[mid] == tar) {
            return mid;
        }

        // mid on line one

        if (arr[si] <= arr[mid]) {
            // case a : left
            if (arr[si] <= tar && tar <= arr[mid]) {
                return search(arr, tar, si, mid - 1);
            } else {
                // case b : right
                return search(arr, tar, mid + 1, ei);
            }
        }

        // mid on line 2
        else {
            // case c: right
            if (arr[mid] <= tar && tar <= arr[ei]) {
                return search(arr, tar, mid + 1, ei);
            } else {
                return search(arr, tar, si, mid - 1);
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = { 4, 5, 6, 7, 0, 1, 2 };
        int target = 0;
        System.out.println(search(arr, target, 0, arr.length - 1));
    }
}
