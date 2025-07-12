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

    public static String[] Merge(String[] arr1, String[] arr2) {
        int i = 0;
        int j = 0;
        int idx = 0;
        int m = arr1.length;
        int n = arr2.length;
        String[] arr3 = new String[m + n];

        while (i < m && j < n) {
            if (isSmallerStr(arr1[i], arr2[j])) {
                arr3[idx] = arr1[i];
                idx++;
                i++;
            } else {
                arr3[idx] = arr2[j];
                j++;
                idx++;
            }
        }
        
        while (i < m) {
            arr3[idx] = arr1[i];
            i++;
            idx++;
        }
        while (j < n) {
            arr3[idx] = arr2[j];
            j++;
            idx++;
        }
        return arr3;
    }

    static boolean isSmallerStr(String str1, String str2) {

        if (str1.compareTo(str2) < 0) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        String[] arr = { "sun", "earth", "mars", "mercury" };
        String[] sortedArrStr = MergeSort(arr, 0, arr.length - 1);
        for (int i = 0; i < sortedArrStr.length; i++) {
            System.out.print(sortedArrStr[i] + " ");
        }
    }
}
