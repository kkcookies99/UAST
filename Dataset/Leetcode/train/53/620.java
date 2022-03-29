 class Solution {
    public int XXX(int[] nums) {
        int len = nums.length;

        //以当前位置结尾的子数组的最大和
        int[] dp = new int[len];

        //base case 
        dp[0] = nums[0];

        int max = dp[0];
        //转移方程：若dp[i - 1] 大于 0， dp[i] = dp[i - 1] + nums[i];否则 dp[i] = nums[i];
        for (int i = 1; i < len; i++) {
            if (dp[i - 1] > 0) {
                dp[i] = dp[i - 1] + nums[i];
            } else {
                dp[i] = nums[i];
            }
            max = Math.max(max, dp[i]);
        }

        return max;
    }
}

