class Solution {
    public int XXX(int n) {
        //状态：从第0个台阶跳到当前台阶的不同方式
        int[] dp = new int[n + 1];

        //base case
        dp[0] = 1;
        dp[1] = 1;
        
        //转移方程
        for (int i = 2; i < n + 1; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }

        return dp[n];
    }
}

