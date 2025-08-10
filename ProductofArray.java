// 238. Product of Array Except Self
// https://leetcode.com/problems/product-of-array-except-self/description

class Solution {
    public int[] productExceptSelf(int[] nums) {
        int result[] = new int[nums.length]; // Buat array hasil

        for (int i = 0, product = 1; i < nums.length; i++) {
            result[i] = product; // Pertama - tama kita buat prefix, dimana dia akan kali semua dari yang kiri
            product *= nums[i];
        }

        for (int i = nums.length - 1, product = 1; i >= 0; i--) {
            result[i] *= product; // Terus dia postfix dimana hasil dari prefix akan dikali sama nums[i] yang
                                  // mulai dari akhir/kanan
            product *= nums[i];
        }

        return result;
    }
}