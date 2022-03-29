 class Solution {
    public int[] XXX(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (i == j) {
                    continue;
                }
                int result = nums[i] + nums[j];
                if (result == target) {
                    return new int[]{i, j};
                }
            }
        }
        return null;
    }
}

