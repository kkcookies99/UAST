 class Solution {
    public boolean XXX(int[] nums) {
        int len = nums.length;
        //起始位置能否跳至当前位置
        boolean[] dp = new boolean[len];

        //base case
        dp[0] = true;

        //转移方程：i前面所有的点只要有一个能跳到当前结点就说明当前结点可达
        for (int i = 1; i < len; i++) {
            for (int j = 0; j < i; j++) {
                if (dp[j] && (j + nums[j] >= i)) {
                    dp[i] = true;
                    break;
                }
            }
        }

        return dp[len - 1];
    }
}

