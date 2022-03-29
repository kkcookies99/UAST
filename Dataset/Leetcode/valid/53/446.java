 class Solution {
    public int XXX(int[] nums) {
        int max = nums[0];
        for (int i = 1; i < nums.length; i++) {
            nums[i] = Math.max(nums[i - 1] + nums[i], nums[i]);
            max = Math.max(nums[i], max);
        }
        return max;
    }
}```

