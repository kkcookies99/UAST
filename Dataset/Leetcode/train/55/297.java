class Solution {
    public boolean XXX(int[] nums) {
        int n = nums.length;
        boolean[] dp = new boolean[n];
        dp[0] = true;

        for(int i = 1; i < n; i++) {
            boolean flag = false;
            for(int j = 0; j < i; j++) {
                if(dp[j] && nums[j] >= (i - j)) {
                    flag = true;
                    break;
                }
            }

            dp[i] = flag;
        }

        return dp[n-1];
    }
}

