 class Solution {
    public int XXX(int[] nums) {
        int length = nums.length;
        if(length == 1) {
            return nums[0];
        }

        int[] dp = new int[length];
        Arrays.fill(dp, Integer.MAX_VALUE);
        int max = Integer.MAX_VALUE;
        for(int i=0;i<length;i++) {
            if(max == Integer.MAX_VALUE) {
                max = f(nums, i, dp);
            } else {
                max = Math.max(f(nums, i, dp), max);
            }
        }
        return max;
    }

    private int f(int[] nums, int i, int[] dp) {
        if(i == 0) {
            if (dp[i] == Integer.MAX_VALUE) {
                dp[i] = nums[0];
            }
            return dp[i];
        }
        if (dp[i] == Integer.MAX_VALUE) {
            dp[i] = nums[i] + Math.max(f(nums, i-1, dp), 0);
        }
        return dp[i];
    }
}

