// Given an integer array of size n, find all elements that appear
// more than [n/3] times.
// Input : {1,3,2,5,1,3,1,5,1}
// Output : 1
// Input : {1,2}
// output : 1, 2

import java.util.HashMap;
import java.util.Set;

public class MajorityEle {

    public static void majorityEle(int[] nums) {
        HashMap<Integer, Integer> hm = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            if (hm.containsKey(num)) {
                hm.put(num, hm.get(num) + 1);
            } else {
                hm.put(num, 1);
            }
        }
        Set<Integer> keySet = hm.keySet();
        for (int key : keySet) {
            if (hm.get(key) > nums.length / 3) {
                System.out.print(key + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int nums[] = { 1, 3, 2, 5, 1, 3, 1, 5, 1 };
        int nums1[] = { 1, 2 };
        majorityEle(nums1);
    }

}
