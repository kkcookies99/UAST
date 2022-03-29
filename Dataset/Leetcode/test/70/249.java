class Solution {
    public int XXX(int n) {
        // 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
        // 内存消耗：34.7 MB, 在所有 Java 提交中击败了99.56%的用户
        int[] dp = new int[n];
        if(n<3)
        return n;
        else
        dp[0] = 1;
        dp[1] = 2;
        for (int i = 3;i<n;i++){
            dp[i] = dp[i-1] +  dp[i-2];
        }
        return dp[n-1];
    }
}

