 class Solution {
    public int XXX(int m, int n) {
        // 走到当前位置能有几种不同路径
        int[] dp = new int[n];
        // 第一行只有一种 就是向右走   第一列只有一种，就是向下走
        Arrays.fill(dp, 1);
        
        // 使用一维数组是因为 只与左边和上边有关 可以抹去记忆

        for(int i=1; i<m; i++){
            for(int j=1; j<n; j++){
                dp[j] = dp[j] + dp[j-1];
            }
        }

        return dp[n-1];
    }
}

