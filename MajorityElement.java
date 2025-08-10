class Solution {
    public int majorityElement(int[] nums) {
        int limit = nums.length / 2;

        for (int i = 0; i < nums.length; i++) {
            int count = 1;
            for (int j = 1; j < nums.length; j++) {
                if (nums[j] == nums[i]) {
                    count++;
                }
            }

            if (count > limit) {
                return nums[i];
            }
        }

        return -1;
    }
}