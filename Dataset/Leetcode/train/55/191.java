 public boolean XXX(int[] nums) {
        int len = nums.length;
        int[] dp = new int[len];
        dp[0]=nums[0];
        for (int i = 0; i < len - 1; i++) {
            int index = i + 1;
            while (dp[i]>0&&nums[i] > 0) {
                if (index==len) return true;
                dp[index++] = 1;
                nums[i]--;
            }
        }
        return dp[len - 1] > 0;

    }

