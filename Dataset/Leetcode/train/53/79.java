public int XXX(int[] nums) {
        int n = nums.length;
        // dp代表每个位置能达到最大的值。
        int[] dp = new int[n];
        dp[0] = nums[0];
        int max = nums[0];
        for(int i=1; i<n; i++){
            dp[i] = Math.max(dp[i-1]+nums[i], nums[i]);
            if(dp[i]>max) max = dp[i];
        }
        return max;

    }

