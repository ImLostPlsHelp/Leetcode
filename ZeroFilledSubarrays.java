// 2348. Number of Zero-Filled Subarrays
// https://leetcode.com/problems/number-of-zero-filled-subarrays/description

class Solution {
    public long zeroFilledSubarray(int[] nums) {
        long amountofZeroes = 0; // Pakai long karena bisa jadi jumlah 0-nya banyak sampai int gak bisa
                                 // nge-handle dengan baik
        long result = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                amountofZeroes++; // Cara kerjanya gampang, tinggal setiap ada 0 kita langsung tambah
                                  // amountofzeroes
                result += amountofZeroes; // Terus ditambah ke result langsung, Contoh
                                          // [1,3,0,0,2,0,0,4] -> 1 + 2 + 1 + 2 = 6, ada sub array [0] 4, [0, 0] 2.
            } else {
                amountofZeroes = 0;
            }
        }

        return result;
    }
}
