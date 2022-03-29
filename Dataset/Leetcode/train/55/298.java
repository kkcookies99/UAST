class Solution {
    public boolean XXX(int[] nums) {
        int len = nums.length;
        if (len <= 1) {return true;}
        int[] dp = new int[len];
        dp[0] = nums[0];
        for (int i = 1; i < len; i++) {
            if (dp[i - 1] >= i) {
                dp[i] = Math.max(i + nums[i], dp[i - 1]);
            } else {
                return false;
            }
        }
        return true;
    }
}

