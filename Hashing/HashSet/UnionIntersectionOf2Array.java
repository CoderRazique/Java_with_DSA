package Hashing.HashSet;

import java.util.HashSet;

// Union and Intersection Of 2 Array
// arr1 = {7,3,9};
// arr2 = {6,3,9,2,9,4};
// Output: union = 6 (7,3,9,6,2,4)
//         intersection = 2 (3,9)

public class UnionIntersectionOf2Array {

    public static int union(int[] arr1, int[] arr2) {
        HashSet<Integer> hs = new HashSet<>();
        for (int i = 0; i < arr1.length; i++) {
            hs.add(arr1[i]);
        }
        for (int i = 0; i < arr2.length; i++) {
            hs.add(arr2[i]);
        }
        return hs.size();
    }

    public static int intersection(int[] arr1, int[] arr2) {
        HashSet<Integer> hs = new HashSet<>();
        for (int i = 0; i < arr1.length; i++) {
            hs.add(arr1[i]);
        }
        int count = 0;
        for (int i = 0; i < arr2.length; i++) {
            if (hs.contains(arr2[i])) {
                count++;
                hs.remove(arr2[i]);
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] arr1 = { 7, 3, 9 };
        int[] arr2 = { 6, 3, 9, 2, 9, 4 };
        System.out.println("Union : " + union(arr1, arr2));
        System.out.println("Intersection : " + intersection(arr1, arr2));
    }
}
