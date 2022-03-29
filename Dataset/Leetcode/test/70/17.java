class Solution {
    public int XXX(int n) {
        //f(n) = f(n-1) + f(n-2);
        int[] dp = new int[n + 1];
        dp[0] = 1;//俗称托马斯360度原地爬
        dp[1] = 1;
        for(int i = 2; i<=n; i++){
            dp[i] = dp[i-1] + dp[i-2];
        }
        return dp[n];
    }
}

