 class Solution {
    public int[] XXX(int[] nums, int target) {
        int diff;
        for (int i=0; i < nums.length; i++) {
            diff = target - nums[i];
            for (int j = nums.length - 1; j > i; j--) {
                if (nums[j] == diff) {
                    return new int[]{i,j};
                }
            }
        }
        return null;
    }
}

