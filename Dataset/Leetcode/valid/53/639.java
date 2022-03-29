 class Solution {
    public int XXX(int[] nums) {
        if(nums == null || nums.length == 0) return 0;
        int len = nums.length;
        int[] dp = new int[len];
        dp[0] = nums[0];
        int max = dp[0];
        for(int i = 1; i < len; i++){
            dp[i] = nums[i] + Math.max(dp[i - 1], 0);
            if(dp[i] > max) max = dp[i];
        }
        return max;

    }
}

