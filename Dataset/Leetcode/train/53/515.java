 class Solution {
    public int XXX(int[] nums) {
        int max = nums[0];
        int tmp = nums[0];
        for (int i = 1; i < nums.length; i++) {
            tmp = Math.max(nums[i], tmp + nums[i]);
            max = Math.max(max, tmp);
        }
        return max;
    }
}

