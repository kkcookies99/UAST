  public int XXX(int[] nums) {
       /* int[] dp = new int[nums.length];
        dp[0] = nums[0];
        int result = Integer.MIN_VALUE;
        for (int i = 1; i < nums.length; i++) {
            if (dp[i - 1] < 0) {
                dp[i] = nums[i];
            } else {
                dp[i] = dp[i - 1] + nums[i];
            }
            result = Math.max(result, dp[i]);
        }
        return Math.max(result, dp[0]);*/

        int prev = nums[0];
        int result = Integer.MIN_VALUE;
        for (int i = 1; i < nums.length; i++) {
            int current;
            if (prev < 0) {
                current = nums[i];
            } else {
                current = prev + nums[i];
            }
            result = Math.max(result, current);
            prev = current;
        }
        return Math.max(result, prev);

    }

