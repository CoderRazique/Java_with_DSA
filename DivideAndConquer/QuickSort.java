public class QuickSort {

    public static void Quick_Sort(int[] arr, int si, int ei) {
        if (si >= ei) {
            return;
        }
        // last element
        int pIdx = Partittion(arr, si, ei);
        Quick_Sort(arr, si, pIdx - 1); // left
        Quick_Sort(arr, pIdx + 1, ei); // right

    }

    public static int Partittion(int[] arr, int si, int ei) {
        int pivot = arr[ei];
        int i = si - 1;

        for (int j = si; j < ei; j++) {
            if (arr[j] <= pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        i++;
        int temp = pivot;
        arr[ei] = arr[i];
        arr[i] = temp;
        return i;
    }

    public static void printArr(int[] arr) {
        for (int k = 0; k < arr.length; k++) {
            System.out.print(arr[k] + " ");
        }
    }

    public static void main(String[] args) {
        int[] arr = { 6, 3, 9, 8, 2, 5, -3 };
        Quick_Sort(arr, 0, arr.length - 1);
        printArr(arr);
    }

}
