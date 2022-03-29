     public int XXX(int[] nums) {
        int length = nums.length;
        if (length == 0) return 0;
        if (length == 1) return nums[0];
        int[] dp = new int[length];
        // dp[i] => 以nums[i]结尾的所有子串和的最大值
        // dp[i + 1] = max(dp[i] + nums[i + 1], nums[i + 1])
        // 不过dp[final]并非是我们所求的结果
        // dp[]中的最大值才是
        int max = nums[0];
        dp[0] = nums[0];
        for (int i = 1; i < dp.length; i++) {
            dp[i] = Math.max(dp[i - 1] + nums[i], nums[i]);
            max = Math.max(dp[i],max);
        }
        return max;
    }


