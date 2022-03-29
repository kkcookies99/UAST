    public int XXX(int[] nums) {
        int max = Integer.MIN_VALUE;
        int[] dp = new int[nums.length+1];
        for (int i = 1; i <= nums.length; i++) {
            dp[i] += Math.max(0,dp[i-1]) + nums[i-1];
            if(dp[i] > max) max = dp[i];
        }
        return max;
    }

