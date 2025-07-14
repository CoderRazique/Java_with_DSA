package Hashing.HashSet;
// Count Distinct Elements

// nums = {4,3,2,5,6,7,3,4,2,1};
// output = 7

import java.util.HashSet;

public class CountDistinctElements {

    public static int countDistinctElement(int[] nums) {
        HashSet<Integer> hs = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            hs.add(nums[i]);
        }

        return hs.size();
    }

    public static void main(String[] args) {
        int[] nums = { 4, 3, 2, 5, 6, 7, 3, 4, 2, 1 };
        System.out.println("Total distinct element : " + countDistinctElement(nums));
    }
}
