//Explanation
// 1. Dua pointer, j untuk start dan i untuk iterasi kaya biasa
// 2. Kalau misalnya j 0 dan i bukan 0, ganti nilai j sama i terus j ditambah
// 3. Kalau misalnya j bukan 0, j lansgung ditambah aja biar skip next nilai
class Solution {
    public void moveZeroes(int[] nums) {
        int j = 0;

        if (nums.length == 1) {
            return;
        }

        for (int i = 1; i < nums.length; i++) {
            if (nums[j] == 0 && nums[i] != 0) {
                nums[j] = nums[i];
                nums[i] = 0;
                j++;
            } else if (nums[j] != 0) {
                j++;
            }
        }
    }
}