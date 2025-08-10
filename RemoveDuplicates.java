// 26. Remove Duplicates from Sorted Array
// https://leetcode.com/problems/remove-duplicates-from-sorted-array/description/?__cf_chl_tk=jihUU.Upe7WLsguLHMLvPWR4Y_uAy4pg2MHVhNHzuxk-1754241289-1.0.1.1-kAe0yz9Vs3mi5uWibm3nAhEjzaZz4koNGWcG8b1EsNI

class Solution {
    public int removeDuplicates(int[] nums) {
        int k = 1; // Pasti mulai dari 1 karena udah pasti ada yang unik 1
        int lastNum = nums[0];
        int pointer = 1;

        for (int i = 0; i < nums.length; i++) {
            if (i == nums.length) {
                return k; // Just in case
            } else if (nums[i] != lastNum) {
                lastNum = nums[i]; // Kalau beda lastNum ganti ke nums[i]
                nums[pointer] = nums[i]; // Ganti nilai yang di pointer ke nums[i]
                pointer++; // Pointer maju
                k++;
            }
        }

        return k;
    }
}
