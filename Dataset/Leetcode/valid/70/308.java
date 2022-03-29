class Solution {
    public int XXX(int n) {
        int[] dp=new int[n+1];
        //初始化数组为0和1的值
        dp[0] = dp[1] = 1;
        for(int i = 2; i <= n; ++i) {
       //f(n)=f(n-1)+f(n-2)
            dp[i] = dp[i - 1] + dp[i - 2];  
        }
        return dp[n];
    }
}

