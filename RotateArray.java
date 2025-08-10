// 189. Rotate Array
// https://leetcode.com/problems/rotate-array/description

class Solution {
    public void rotate(int[] nums, int k) {
        int[] newArray = new int[nums.length];
        int pivotPoint = nums.length - k;

        // Buat case kalau k lebih besar
        // Cara kerjanya nums.length kurang sisa pembagian k sama nums.length
        // Misal pivot = 2 - 7%2 = 2 - 1 = 1
        if (k > nums.length) {
            pivotPoint = nums.length - (k % nums.length);
        }

        if (nums.length == 1) {
            return;
        }

        for (int i = pivotPoint; i < nums.length; i++) {
            newArray[i - pivotPoint] = nums[i];
        }

        for (int i = 0; i < pivotPoint; i++) {
            newArray[nums.length - pivotPoint + i] = nums[i];
        }

        for (int i = 0; i < nums.length; i++) {
            nums[i] = newArray[i];
        }
    }
}