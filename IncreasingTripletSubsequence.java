// 334. Increasing Triplet Subsequence
// https://leetcode.com/problems/increasing-triplet-subsequence/description

class Solution {
    // Di soal, i < j < k && nums[i] < nums[j] < nums[k]
    public boolean increasingTriplet(int[] nums) {
        int num1 = nums[0];
        int num2 = Integer.MAX_VALUE; // Nilai ini placeholder, soalnya bisa aja 0 itu value valid, sehingga kalau di
                                      // if kita check apakah num2 masih nol, meskipun nol valid dia tetep overwrite

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] <= num1) {
                num1 = nums[i]; // Ini hanya mengecek nilai terkecil yang sedang dilihat, dan boleh di re-write
                                // karena adanya nilai yang bukan placeholder di num 2 menandakan ada nilai yang
                                // lebih kecil dari num2 pada posisi - posisi sebelumnya.
            } else if (num2 == Integer.MAX_VALUE || nums[i] <= num2) {
                num2 = nums[i];
            } else if (nums[i] > num2) {
                return true;
            }
        }

        return false;
    }
}