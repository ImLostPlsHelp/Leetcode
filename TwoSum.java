
// 1. Two Sum
// https://leetcode.com/problems/two-sum/description
import java.util.HashMap;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> num = new HashMap<>();

        for (int i = 0; i < nums.length; i++) { // Cara kerja kode ini adalah
            int complement = target - nums[i]; // 1. Kita cari complement (target dikurang nilai index i)
            if (num.containsKey(complement)) { // 2. Kalau misalnya ada di dalam hashmap nilai tersebut, maka langsung
                                               // kita return
                return new int[] { num.get(complement), i };
            }
            num.put(nums[i], i); // 3. Kalau nggak, kita taruh nilai nums[i] sama indexnya
        }
        return null;
    }
}