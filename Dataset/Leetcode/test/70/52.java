class Solution {
    public int XXX(int n) {
        // int[] dp = new int[n + 1];
        // dp[0] = 1;
        // dp[1] = 1;
        // for(int i = 2 ; i <= n ; i++){
        //     dp[i] = dp[i-1] + dp[i-2];
        // }
        // return dp[n];
        if(n <= 1) return 1;
        if(n == 2) return 2;
        int prepre = 1;
        int pre = 1;
        int cur = 0;
        for(int i = 2 ; i <= n ; i++){
            cur = prepre + pre;
            prepre = pre;
            pre = cur;
        }
        return cur;
    }
}

